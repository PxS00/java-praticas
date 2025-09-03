package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection abrirConexao(){
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url  = getEnvOrThrow("DB_URL");
            String user = getEnvOrThrow("DB_USER");
            String pass = getEnvOrThrow("DB_PASS");

            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexão Aberta");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: A classe de conexão não foi encontrada.\n" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro de SQL\n" + e.getMessage());
        }
        return con;
    }
    public static void fecharConexao(Connection con){
        try {
            con.close();
            System.out.println("\nConexão fechada");
        } catch (SQLException e) {
            System.out.println("Erro de SQL\n" + e.getMessage());
        }
    }
    private static String getEnvOrThrow(String key) {
        String v = System.getenv(key);
        if (v == null || v.isBlank()) {
            throw new IllegalStateException("Variável de ambiente não definida: " + key);
        }
        return v;
    }
}
