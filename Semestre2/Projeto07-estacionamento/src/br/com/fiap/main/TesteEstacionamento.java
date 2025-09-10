package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;
import br.com.fiap.dto.Cliente;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.util.ArrayList;

public class TesteEstacionamento {
    public static void main(String[] args) {
        boolean continuar = true;
        Connection con = ConnectionFactory.abrirConexao();

        while (continuar) {
            String[] opcoes = {"Carro", "Cliente"};
            int escolha = JOptionPane.showOptionDialog(null, "O que deseja manipular?",
                    "Menu Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            if (escolha == 0) {
                manipularCarro(con);
            } else if (escolha == 1) {
                manipularCliente(con);
            } else {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário.", "Encerrado", JOptionPane.WARNING_MESSAGE);
                break;
            }

            int resp = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja continuar?",
                    "Continuar",
                    JOptionPane.YES_NO_OPTION
            );
            if (resp != JOptionPane.YES_OPTION) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "Programa finalizado. Obrigado por utilizar o sistema!", "Finalizado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        ConnectionFactory.fecharConexao(con);
    }

    public static void manipularCarro(Connection con) {
        String[] opcoes = {"Inserir", "Alterar", "Excluir"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "O que deseja fazer com o carro?",
            "Menu Carro",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );

        CarroDAO carroDAO = new CarroDAO(con);
        String mensagem;
        String placa;
        String cor;
        String descricao;
        Carro carro;
        switch (escolha) {
            case 0: // Inserir
                placa = JOptionPane.showInputDialog("Digite a placa do carro:");
                cor = JOptionPane.showInputDialog("Digite a cor do carro:");
                descricao = JOptionPane.showInputDialog("Digite a descrição do carro:");
                carro = new Carro();
                carro.setPlaca(placa);
                carro.setCor(cor);
                carro.setDescricao(descricao);
                mensagem = carroDAO.inserir(carro);
                JOptionPane.showMessageDialog(null, mensagem);
                break;
            case 1: // Alterar
                placa = JOptionPane.showInputDialog("Digite a placa do carro a alterar:");
                cor = JOptionPane.showInputDialog("Digite a nova cor:");
                descricao = JOptionPane.showInputDialog("Digite a nova descrição:");
                carro = new Carro();
                carro.setPlaca(placa);
                carro.setCor(cor);
                carro.setDescricao(descricao);
                mensagem = carroDAO.alterar(carro);
                JOptionPane.showMessageDialog(null, mensagem);
                break;
            case 2: // Excluir
                placa = JOptionPane.showInputDialog("Digite a placa do carro a excluir:");
                carro = new Carro();
                carro.setPlaca(placa);
                mensagem = carroDAO.excluir(carro);
                JOptionPane.showMessageDialog(null, mensagem);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
        }

        ArrayList<Carro> resultado = carroDAO.listarTodos();
        if(resultado != null && !resultado.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for(Carro c : resultado){
                sb.append("Placa: ").append(c.getPlaca())
                  .append(" | Cor: ").append(c.getCor())
                  .append(" | Descrição: ").append(c.getDescricao())
                  .append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString(), "Carros cadastrados", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado.", "Carros cadastrados", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void manipularCliente(Connection con) {
        String[] opcoes = {"Inserir", "Alterar", "Excluir"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "O que deseja fazer com o cliente?",
            "Menu Cliente",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );

        ClienteDAO clienteDAO = new ClienteDAO(con);
        String mensagem;
        int idCliente;
        String nomeCliente;
        String placa;
        Cliente cliente;
        switch (escolha) {
            case 0: // Inserir
                idCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente:"));
                nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
                placa = JOptionPane.showInputDialog("Digite a placa do carro do cliente:");
                cliente = new Cliente();
                cliente.setIdCliente(idCliente);
                cliente.setNomeCliente(nomeCliente);
                cliente.setPlaca(placa);
                mensagem = clienteDAO.inserir(cliente);
                JOptionPane.showMessageDialog(null, mensagem);
                break;
            case 1: // Alterar
                idCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente a alterar:"));
                nomeCliente = JOptionPane.showInputDialog("Digite o novo nome do cliente:");
                placa = JOptionPane.showInputDialog("Digite a nova placa do carro do cliente:");
                cliente = new Cliente();
                cliente.setIdCliente(idCliente);
                cliente.setNomeCliente(nomeCliente);
                cliente.setPlaca(placa);
                mensagem = clienteDAO.alterar(cliente);
                JOptionPane.showMessageDialog(null, mensagem);
                break;
            case 2: // Excluir
                idCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente a excluir:"));
                cliente = new Cliente();
                cliente.setIdCliente(idCliente);
                mensagem = clienteDAO.excluir(cliente);
                JOptionPane.showMessageDialog(null, mensagem);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
        }
        ArrayList<Cliente> resultado = clienteDAO.listarTodos();
        if (resultado != null && !resultado.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Cliente c : resultado) {
                sb.append("ID: ").append(c.getIdCliente())
                        .append(" | Nome: ").append(c.getNomeCliente())
                        .append(" | Placa: ").append(c.getPlaca());
                if (c.getCarro() != null) {
                    sb.append(" | Carro: ")
                            .append(c.getCarro().getDescricao());
                }
                sb.append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString(), "Clientes cadastrados", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum cliente cadastrado.", "Clientes cadastrados", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
