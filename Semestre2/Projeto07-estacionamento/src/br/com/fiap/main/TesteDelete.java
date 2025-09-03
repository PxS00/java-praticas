package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

import java.sql.Connection;

public class TesteDelete {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();
        Carro c = new Carro();
        c.setPlaca("LRD2005");

        CarroDAO dao = new CarroDAO(con);
        System.out.println(dao.excluir(c));

        ConnectionFactory.fecharConexao(con);
    }
}
