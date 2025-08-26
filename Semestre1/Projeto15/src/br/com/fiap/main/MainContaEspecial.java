package br.com.fiap.main;

import br.com.fiap.bean.ContaEspecial;
import br.com.fiap.bean.ContaPoupanca;

import javax.swing.*;

public class MainContaEspecial {
    public static void main(String[] args) {
        String auxiliar, escolha = "sim";
        int numConta, opcao;
        float saldo, valor, limite;
        while (escolha.equalsIgnoreCase("sim")){
            try {
                auxiliar = JOptionPane.showInputDialog("Digite número da conta poupança");
                numConta = Integer.parseInt(auxiliar);
                auxiliar = JOptionPane.showInputDialog("Digite valor do saldo");
                saldo = Float.parseFloat(auxiliar);
                auxiliar = JOptionPane.showInputDialog("Digite o valor do seu limite");
                limite = Float.parseFloat(auxiliar);
                ContaEspecial ce = new ContaEspecial();
                ce.setNumConta(numConta);
                ce.setSaldo(saldo);
                ce.setLimite(limite);
                auxiliar = JOptionPane.showInputDialog("Escolha a Operação \n(1) Saque \n(2) Depósito");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao){
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite valor a ser sacado");
                        valor = Float.parseFloat(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format("Dados da Conta \nNúmero da Conta: %d \nSaldo Atual: R$ %.2f", ce.getNumConta(), ce.sacar(valor)));
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite valor a ser depositado");
                        valor = Float.parseFloat(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format("Dados da Conta \nNúmero da Conta: %d \nSaldo Atual: R$ %.2f", ce.getNumConta(), ce.depositar(valor)));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            escolha = JOptionPane.showInputDialog("Deseja continuar?");
        }
        JOptionPane.showMessageDialog(null, "Fim de Programa!");
    }
}
