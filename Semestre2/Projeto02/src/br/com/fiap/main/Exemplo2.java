package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo2 {
    public static void main(String[] args) {

        ArrayList<String> carros = new ArrayList<>(
                Arrays.asList("Volvo", "BMW", "Ford", "Mazda")
        );
        System.out.println(carros);
        carros.set(1, "Volkswagen"); // Substitui
        System.out.println(carros);
        carros.remove(2);
        System.out.println(carros);
        carros.clear();
        System.out.println(carros);
    }
}