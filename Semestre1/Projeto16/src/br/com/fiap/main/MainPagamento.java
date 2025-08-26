package br.com.fiap.main;

import br.com.fiap.bean.Freelancer;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;

public class MainPagamento {
    public static void main(String[] args) {
        String nome, exibe;
        float salario, valorHora;
        int opcao;
        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo de funcionario? \n(1) Freelancer \n(2) Vigia noturno \n(3) Vendedor"));
                nome = JOptionPane.showInputDialog("Digite seu nome");
                valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite valor da hora de trabalho"));
                switch (opcao) {
                    case 1:
                        Freelancer freela = new Freelancer(nome, valorHora);
                        salario = freela.calcularSalario();
                        exibe = String.format("Exibindo os dados: \nNome: %s \nSalário: R$ %.2f", freela.getNome(), salario);
                        break;
                    case 2:
                        float adicional = Float.parseFloat(JOptionPane.showInputDialog("Qual valor do adicional noturno mensal?"));
                        VigiaNoturno vigia = new VigiaNoturno(nome, valorHora, adicional);
                        salario = vigia.calcularSalario();
                        exibe = String.format("Exibindo os dados: \nNome: %s \nSalário: R$ %.2f", vigia.getNome(), salario);
                        break;
                    case 3:
                        float comissao = Float.parseFloat(JOptionPane.showInputDialog("Qual a porcetagem da comissão?"));
                        Vendedor vend = new Vendedor(nome, valorHora, comissao);
                        salario = vend.calcularSalario();
                        exibe = String.format("Exibindo os dados: \nNome: %s \nSalário: R$ %.2f", vend.getNome(), salario);
                        break;
                    default:
                        throw new Exception("Escolha incorreta!");
                }
                JOptionPane.showMessageDialog(null, exibe, "Resultados", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa. Volte sempre!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
