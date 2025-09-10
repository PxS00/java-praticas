package br.com.fiap.main;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;
import java.util.ArrayList;

public class TesteClienteCRUD {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();

        Cliente c1 = new Cliente();
        c1.setIdCliente(1);
        c1.setNomeCliente("Lucas");
        c1.setPlaca("LRD2005");

        Cliente c2 = new Cliente();
        c2.setIdCliente(2);
        c2.setNomeCliente("Anna");
        c2.setPlaca("ABC5738");

        Cliente c3 = new Cliente();
        c3.setIdCliente(3);
        c3.setNomeCliente("Kelson");
        c3.setPlaca("BOC2001");

        Cliente c4 = new Cliente();
        c4.setIdCliente(4);
        c4.setNomeCliente("Alex");
        c4.setPlaca("JKK1900");

        ClienteDAO dao = new ClienteDAO(con);

        System.out.println(dao.inserir(c1));
        System.out.println(dao.inserir(c2));
        System.out.println(dao.inserir(c3));
        System.out.println(dao.inserir(c4));

        c2.setNomeCliente("Anna Luyza");
        System.out.println(dao.alterar(c2));

        System.out.println(dao.excluir(c4));

        ArrayList<Cliente> lista = dao.listarTodos();
        if(lista != null){
            for (Cliente c : lista) {
                System.out.printf("ID=%d | Nome= %s | Placa= %s | Carro= %s%n",
                        c.getIdCliente(),
                        c.getNomeCliente(),
                        c.getPlaca(),
                        c.getCarro() != null ? c.getCarro().getDescricao() : "Sem carro");
            }
        }


        ConnectionFactory.fecharConexao(con);
    }
}
