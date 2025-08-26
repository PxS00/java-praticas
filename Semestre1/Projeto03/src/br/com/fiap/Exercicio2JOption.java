package br.com.fiap;

import javax.swing.*;

public class Exercicio2JOption {
    public static void main(String[] args) {
        int anoAtual, anoNascimento, idade;
        String texto;
        try {
            texto = JOptionPane.showInputDialog("Digite o ano atual");
            anoAtual = Integer.parseInt(texto);
            texto = JOptionPane.showInputDialog("Digite o seu ano de nascimento");
            anoNascimento = Integer.parseInt(texto);
            idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "Você nasceu em " + anoNascimento + " e tem " + idade + " anos.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formatos de números incorretos.");
        }
    }
}
