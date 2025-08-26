package br.com.fiap.main;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroComStream {
    public static void main(String[] args) {
        ArrayList<String> herois = new ArrayList<>(
                Arrays.asList("Homem Aranha", "Wolverine", "Hulk", "Homen Elastico", "Mulher Invisível", "Tocha Humana", "O Coisa", "Homen de Ferro", "Mulher Maravilha", "Batman", "Viúva negra","Super Homen", "Lanterna Verde", "Cíclope", "Noturno")
        );
        List<String> heroiscomH = herois.stream()
                .filter(heroi -> heroi.startsWith("H"))
                .collect(Collectors.toList());
        
        JOptionPane.showMessageDialog(null, "Heróis que começam com a letra H\n" + heroiscomH);

    }
}