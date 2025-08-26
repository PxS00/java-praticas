package br.com.fiap.main;

import javax.swing.*;

public class ManipulaString {
    public static void main(String[] args) {
        String frase = "O rato roeu a roupa do rei de Roma";
        JOptionPane.showMessageDialog(null, frase.length()); // número de caracteres com espaço
        JOptionPane.showMessageDialog(null, frase.toUpperCase()); // transformou tudo em maiúsculo
        JOptionPane.showMessageDialog(null, frase.toLowerCase()); // transformou tudo em minúsculo
        JOptionPane.showMessageDialog(null, frase.substring(23,26)); // mostra só entre os números colocado no parâmetro, lembrando que o caracter final é sem +1
        JOptionPane.showMessageDialog(null, frase.replace("roupa", "parede")); //troca a frase dentro do primeiro aspas pela segunda palavra    ps: substituí todas as plavras daquela colocada, se tivesse dois roupas - mudaria

    }
}
