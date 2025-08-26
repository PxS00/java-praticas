package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> pokemons = new HashMap<>();

        do {
            try {
                String nome, tipo;
                do {
                    nome = JOptionPane.showInputDialog("Digite o NOME do Pokémon ou \"FIM\" para encerrar.").toUpperCase();

                    if (!nome.equals("FIM")) {
                        if (pokemons.containsKey(nome)) {
                            JOptionPane.showMessageDialog(null, "Pokémon já cadastrado!");
                        } else {
                            tipo = JOptionPane.showInputDialog("Digite o TIPO deste Pokémon").toUpperCase();
                            pokemons.put(nome, tipo);
                        }
                    }
                } while (!nome.equals("FIM"));

                String escolha = JOptionPane.showInputDialog("Digite um TIPO para listar os Pokémons").toUpperCase();
                ArrayList<String> nomesEncontrados = new ArrayList<>();
                String lista = "Tipo escolhido: %s \nPokémons encontrados:\n".formatted(escolha);

                for (Map.Entry<String, String> pokemon : pokemons.entrySet()) {
                    if (pokemon.getValue().equals(escolha)) {
                        nomesEncontrados.add(pokemon.getKey());
                    }
                }
                if (nomesEncontrados.isEmpty()) {
                    lista += "(Nenhum Pokémon desse tipo cadastrado)";
                } else {
                    lista += "- %s \n".formatted(nomesEncontrados);
                }
                JOptionPane.showMessageDialog(null, lista);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa. Até breve", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
