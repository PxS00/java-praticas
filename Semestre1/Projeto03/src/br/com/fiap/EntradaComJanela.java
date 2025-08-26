package br.com.fiap;

import javax.swing.*;

public class EntradaComJanela {
    public static void main(String[] args) {
        int num1, num2, resultado;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Dgite um número inteiro"); // mostra uma caixa de diálogo
            num1 = Integer.parseInt(auxiliar); // Integer é o tipo de variavel nao primitivo int
            auxiliar = JOptionPane.showInputDialog("Dgite um outro número inteiro"); // mostra uma caixa de diálogo
            num2 = Integer.parseInt(auxiliar);
            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null, "Valor 1: " + num1 + "\nValor 2: " + num2 + "\nResultado: " + resultado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto!");
        }
    }
}
