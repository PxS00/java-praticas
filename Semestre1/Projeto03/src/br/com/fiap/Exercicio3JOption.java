package br.com.fiap;

import javax.swing.*;

public class Exercicio3JOption {
    public static void main(String[] args) {
        double raio, aC;
        String texto;
        try {
            texto = JOptionPane.showInputDialog("Digite um raio de um círculo");
            raio = Double.parseDouble(texto);
            aC = Math.pow(raio, 2) * Math.PI;
            JOptionPane.showMessageDialog(null, String.format("A área desejada do círculo é: %.2f", aC));
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Formato de números incorretos.");
        }
    }
}
