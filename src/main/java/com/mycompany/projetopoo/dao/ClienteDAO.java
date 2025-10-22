package com.mycompany.projetopoo.dao;

import com.mycompany.projetopoo.Cliente;
import com.mycompany.projetopoo.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    // --- CADASTRAR (INSERT) ---
    public void cadastrar(Cliente cliente) {
        String sql = "INSERT INTO cliente (nome, cpf, telefone, email) VALUES (?, ?, ?, ?)";

        try (Connection conexao = Conexao.getConexao(); // Abre a conexão
                 PreparedStatement stmt = conexao.prepareStatement(sql)) { // Prepara o comando

            // Define os valores para os placeholders 
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());

            stmt.executeUpdate(); // Executa o INSERT
            System.out.println("Cliente " + cliente.getNome() + " cadastrado no banco!");

        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar cliente: " + e.getMessage());
        }
    }

    public void limparTodos() {
        String sql = "DELETE FROM cliente WHERE nome != 'Padrão (PIX/Balcão)'"; // Comando SQL para deletar TUDO

        try (Connection conexao = Conexao.getConexao(); PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.executeUpdate();
            System.out.println("Todos os clientes foram deletados do banco de dados.");

        } catch (SQLException e) {
            System.err.println("Erro ao limpar clientes: " + e.getMessage());
        }
    }

    // --- BUSCAR TODOS (SELECT) ---
    public List<Cliente> buscarTodos() {
        String sql = "SELECT id_cliente, nome, cpf, telefone, email FROM cliente ORDER BY nome";
        List<Cliente> clientes = new ArrayList<>();

        try (Connection conexao = Conexao.getConexao(); // Abre a conexão
                 PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) { // Executa a consulta

            while (rs.next()) { // Loop que percorre cada linha retornada
                Cliente cliente = new Cliente(
                        rs.getInt("id_cliente"), // Pega o ID
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getString("telefone"),
                        rs.getString("email")
                );
                clientes.add(cliente);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao buscar clientes: " + e.getMessage());
        }
        return clientes;
    }

    public int buscarIdPorNome(String nome) {
        String sql = "SELECT id_cliente FROM cliente WHERE nome = ?";

        try (Connection conexao = Conexao.getConexao(); PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, nome);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("id_cliente");
                }
            }

        } catch (SQLException e) {
            System.err.println("Erro ao buscar ID do cliente pelo nome: " + e.getMessage());
            return -1;
        }

        return -1;
    }

    public Cliente buscarPorId(int idCliente) {
        String sql = "SELECT id_cliente, nome, cpf, telefone, email FROM cliente WHERE id_cliente = ?";
        Cliente cliente = null;

        try (Connection conexao = Conexao.getConexao(); PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, idCliente);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // ASSUME que você tem um CONSTRUTOR no Cliente.java que aceita o ID
                    cliente = new Cliente(
                            rs.getInt("id_cliente"), // Necessita do ID aqui
                            rs.getString("nome"),
                            rs.getString("cpf"),
                            rs.getString("telefone"),
                            rs.getString("email")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar cliente por ID: " + e.getMessage());
        }
        return cliente;
    }

}
