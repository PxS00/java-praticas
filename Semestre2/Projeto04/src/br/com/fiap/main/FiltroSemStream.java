package br.com.fiap.main;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.jar.JarEntry;

public class FiltroSemStream {
    public static void main(String[] args) {
        ArrayList<String> herois = new ArrayList<>(
                Arrays.asList("Homem Aranha", "Wolverine", "Hulk", "Homen Elastico", "Mulher Invisível", "Tocha Humana", "O Coisa", "Homen de Ferro", "Mulher Maravilha", "Batman", "Viúva negra","Super Homen", "Lanterna Verde", "Cíclope", "Noturno")
        );
        ArrayList<String> heroiscomH = new ArrayList<>();
        for (String heroi : herois){
            if (heroi.startsWith("H")) {
                heroiscomH.add(heroi);
            }
        }
        JOptionPane.showMessageDialog(null, "Heróis que começam com a letra H\n" + heroiscomH);

    }
}