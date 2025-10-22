package com.mycompany.projetopoo.dao;

import com.mycompany.projetopoo.Cliente;
import com.mycompany.projetopoo.Servico;
import com.mycompany.projetopoo.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServicoDAO {

    // --- BUSCAR TODOS OS SERVIÇOS (SELECT) ---
    public List<Servico> buscarTodos() {
        // SELECT nas colunas id_servico, descricao e valor da sua tabela 'servico'
        String sql = "SELECT id_servico, descricao, valor FROM servico ORDER BY descricao";
        List<Servico> servicos = new ArrayList<>();

        try (Connection conexao = Conexao.getConexao(); PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Servico servico = new Servico(
                        rs.getInt("id_servico"),
                        rs.getString("descricao"),
                        rs.getDouble("valor") // Use getDouble para a coluna DECIMAL(10,2)
                );
                servicos.add(servico);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao buscar serviços: " + e.getMessage());
        }
        return servicos;
    }

    // --- BUSCAR POR NOME (Necessário para a Transação) ---
    public int buscarIdPorDescricao(String descricao) {
        String sql = "SELECT id_servico FROM servico WHERE descricao = ?";

        try (Connection conexao = Conexao.getConexao(); PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, descricao); // Define o nome que estamos procurando

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("id_servico"); // Retorna o ID
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar ID do serviço: " + e.getMessage());
        }
        return -1; // Retorna -1 se não encontrar (ou lance uma exceção)
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

    public String buscarDescricaoPorId(int idServico) {
        String sql = "SELECT descricao FROM servico WHERE id_servico = ?";
        String descricao = "Serviço Removido"; 

        try (Connection conexao = Conexao.getConexao(); PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, idServico);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    descricao = rs.getString("descricao");
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar descrição do serviço por ID: " + e.getMessage());
        }
        return descricao;
    }
}
