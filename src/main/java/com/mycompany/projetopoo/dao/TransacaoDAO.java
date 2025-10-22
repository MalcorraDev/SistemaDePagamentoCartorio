package com.mycompany.projetopoo.dao;

import com.mycompany.projetopoo.Conexao;
import com.mycompany.projetopoo.Transacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TransacaoDAO {

    // --- REGISTRAR TRANSAÇÃO (INSERT) ---
    public void registrarTransacao(Transacao transacao) {
        // Agora que a coluna 'valor' existe, o SQL está correto
        String sql = "INSERT INTO transacao (id_cliente, id_servico, data, valor) VALUES (?, ?, ?, ?)";

        try (Connection conexao = Conexao.getConexao(); PreparedStatement stmt = conexao.prepareStatement(sql)) {

            // --- NOVO CÓDIGO DE CONVERSÃO DE DATA ---
            // 1. Define o formato de entrada (o que o usuário digitou: DD/MM/YYYY)
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // 2. Converte a String do objeto Transacao para um objeto de data interno
            LocalDate localDate = LocalDate.parse(transacao.getdata(), inputFormatter);

            // 3. Formata para o formato ISO (YYYY-MM-DD), que o SQL espera
            String mysqlDate = localDate.format(DateTimeFormatter.ISO_DATE);
            // ----------------------------------------

            stmt.setInt(1, transacao.getId_cliente());
            stmt.setInt(2, transacao.getId_servico());
            stmt.setString(3, mysqlDate); // Usa a data CONVERTIDA
            stmt.setDouble(4, transacao.getvalor());

            stmt.executeUpdate();
            System.out.println("Transação registrada com sucesso no banco!");

        } catch (SQLException e) {
            System.err.println("Erro ao registrar transação: " + e.getMessage());
        } catch (java.time.format.DateTimeParseException e) {
            System.err.println("Erro de formato de data. Use DD/MM/AAAA.");
        }
    }

    // --- BUSCAR TODAS AS TRANSAÇÕES (Para o Histórico) ---
    public List<Transacao> buscarTodas() {
        // SQL CORRETO: Agora a coluna 'valor' é puxada do banco
        String sql = "SELECT id_transacao, id_cliente, id_servico, data, valor FROM transacao ORDER BY id_transacao DESC";
        List<Transacao> transacoes = new ArrayList<>();

        try (Connection conexao = Conexao.getConexao(); PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Transacao t = new Transacao(
                        rs.getInt("id_transacao"),
                        rs.getInt("id_cliente"),
                        rs.getInt("id_servico"),
                        rs.getString("data"),
                        rs.getDouble("valor") // Puxa o valor da nova coluna
                );
                transacoes.add(t);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar histórico de transações: " + e.getMessage());
        }
        return transacoes;
    }
}
