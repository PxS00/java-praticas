package br.com.fiap;

import javax.swing.*;

public class Exercicio1Joption {
    public static void main(String[] args) {
        float prova1, prova2, prova3, prova4, media;
        String texto;
        try {
            texto = JOptionPane.showInputDialog("Digite a nota da prova 1");
            prova1 = Float.parseFloat(texto);
            texto = JOptionPane.showInputDialog("Digite a nota da prova 2");
            prova2 = Float.parseFloat(texto);
            texto = JOptionPane.showInputDialog("Digite a nota da prova 3");
            prova3 = Float.parseFloat(texto);
            texto = JOptionPane.showInputDialog("Digite a nota da prova 4");
            prova4 = Float.parseFloat(texto);
            media = (prova1 + prova2 + prova3 + prova4) / 4;
            JOptionPane.showMessageDialog(null, "Nota da prova 1: " + prova1 + "\nNota da prova 2: " + prova2 +
                    "\nNota da prova 3: " + prova3 + "\nNota da prova 4: " + prova4 + "\nMédia das provas: " + media);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Números inválidos");
        }
    }
}
