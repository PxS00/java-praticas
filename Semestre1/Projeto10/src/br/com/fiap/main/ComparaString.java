package br.com.fiap.main;

import javax.swing.*;

public class ComparaString {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite sua senha");
        if (senha.equals("P@ssW0rd")) { // exatamente igual com letras maiúsculas e minúsculas
            JOptionPane.showMessageDialog(null, "Acesso concedido");
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado");
        }
        if (senha.equalsIgnoreCase("P@ssW0rd")) { // ignora o fato de letras maiúsculas e minúsculas
            JOptionPane.showMessageDialog(null, "Permitido acesso");
        } else {
            JOptionPane.showMessageDialog(null, "Proibido acesso");
        }
    }
}
