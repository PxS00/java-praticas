package br.com.fiap.main;

import java.util.HashMap;
import java.util.Map;

public class NavegaHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Anna", 22);
        pessoas.put("Lucas", 18);
        pessoas.put("Kelson", 24);
        pessoas.put("Alex", 18);
        // System.out.println(pessoas);
        for(Map.Entry<String, Integer>i : pessoas.entrySet()) {
            System.out.println("Chave:" + i.getKey() + "\nValor:" + i.getValue());
        }
    }
}
