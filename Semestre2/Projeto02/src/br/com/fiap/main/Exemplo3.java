package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exemplo3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(
                Arrays.asList(34,7,55,2,89,23)
        );
        for (int i = 0; i < numeros.size(); i++) {
            System.out.printf("%d ", numeros.get(i));
        }
        Collections.sort(numeros);
        System.out.println();

        for(Integer i : numeros){
            System.out.printf("%d ", i);
        }

    }
}
