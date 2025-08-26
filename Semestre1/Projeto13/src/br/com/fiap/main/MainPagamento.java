package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;

public class MainPagamento {
    public static void main(String[] args) {
        String auxiliar, escolha = "sim";
        String nome;
        float valorHoraTrabalho, adicionalNoturno, comissao;
        int opcao;

        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog("Qual tipo de funcionário você deseja calcular o salário? \n(1) Funcionário padrão \n(2) Vigia noturno \n(3) Vendedor");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite o nome do funcionário");
                        nome = auxiliar;
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do salario");
                        valorHoraTrabalho = Float.parseFloat(auxiliar);
                        Funcionario func = new Funcionario(nome, valorHoraTrabalho);
                        float salario = func.calcularSalario();
                        JOptionPane.showMessageDialog(null, String.format("Nome do funcionário: %s \nValor do salário: %.2f", nome, salario));
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite o nome do funcionário");
                        nome = auxiliar;
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do salario");
                        valorHoraTrabalho = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do adicional noturno");
                        adicionalNoturno = Float.parseFloat(auxiliar);
                        VigiaNoturno vigia = new VigiaNoturno(nome, valorHoraTrabalho, adicionalNoturno);
                        float salario1 = vigia.calcularSalario();
                        JOptionPane.showMessageDialog(null, String.format("Nome do funcionário: %s \nValor do salário: %.2f", nome, salario1));
                        break;
                    case 3:
                        break;
                    default:
                        throw new Exception("Escolha Inválida");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Program encerrado");
    }
}


