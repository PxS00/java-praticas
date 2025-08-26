package br.com.fiap.main;

import javax.swing.*;

public class Praticando {
    public static void main(String[] args) {
        String frase1 = JOptionPane.showInputDialog("Me informe uma frase");
        JOptionPane.showMessageDialog(null, frase1);
        JOptionPane.showMessageDialog(null, frase1.length());
        JOptionPane.showMessageDialog(null, frase1.toUpperCase());

        String palavra1 = JOptionPane.showInputDialog("Digite uma palavra que o texto possuí");
        String palavra2 = JOptionPane.showInputDialog("Digite uma palavra que o texto não possuí, para eu trocar pela primera palavra digitada");

        String frase2 = frase1.replace(palavra1, palavra2);
        JOptionPane.showMessageDialog(null, frase2);
        JOptionPane.showMessageDialog(null, frase2.length());

    }
}
