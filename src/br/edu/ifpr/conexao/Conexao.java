package br.edu.ifpr.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://terenciani.com.br/teren671_poo2021?useSSL=false";
    private static final String usuario = "teren671_aluno";
    private static final String senha = "aluno";
    private static Connection conexao = null;
    public static Connection getConexao() {
        if (conexao == null) {
            try {
                conexao = DriverManager.getConnection(URL, usuario, senha);
            } catch (SQLException ex) {
                ex.printStackTrace();
            } 
        }
        return conexao;
    }
}