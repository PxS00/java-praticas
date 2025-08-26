package br.com.fiap.main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exemplo1 {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("Mazda");
        System.out.println(carros.size());
        System.out.println(carros.get(2));
        System.out.println(carros);
    }
}