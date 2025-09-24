package br.com.fiap.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection abrirConexao() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
            final String USER = "rm563770";
            final String PASS = "101005";
            con = DriverManager.getConnection(url, USER, PASS);
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: A classe de conexão não foi encontrada!\n" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro de SQL!\n" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return con;
    }
    public static void fecharConexao(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println("Erro de SQL!\n" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}