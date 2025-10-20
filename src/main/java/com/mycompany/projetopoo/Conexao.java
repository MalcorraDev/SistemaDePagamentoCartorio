package com.mycompany.projetopoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/cartoriodb";
    private static final String USUARIO = "root"; // teu usuário do MySQL
    private static final String SENHA = "";      // tua senha (preenche se tiver)

    public static Connection getConexao() {
        Connection conexao = null;
        try {
            // Tenta estabelecer a conexão
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conectado ao banco com sucesso!");
        } catch (SQLException e) {
            // Se falhar, imprime o erro detalhado
            System.out.println("Erro ao conectar ao banco: " + e.getMessage());
        }
        return conexao;
    }
}