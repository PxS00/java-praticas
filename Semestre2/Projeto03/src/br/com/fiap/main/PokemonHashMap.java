package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> pokemon = new HashMap<>();

        do {
            try {
                String nome, tipo;

                // Cadastro de Pokémon (nome e tipo) — sem permitir repetição de nome
                do {
                    nome = JOptionPane.showInputDialog("Digite o NOME do Pokémon ou \"FIM\" para encerrar.").toUpperCase();

                    if (!nome.equals("FIM")) {
                        if (pokemon.containsKey(nome)) {
                            JOptionPane.showMessageDialog(null, "Pokémon já cadastrado!");
                        } else {
                            tipo = JOptionPane.showInputDialog("Digite o TIPO deste Pokémon").toUpperCase();
                            pokemon.put(nome, tipo);
                        }
                    }

                } while (!nome.equals("FIM"));
                // Busca por tipo escolhido pelo usuário
                String escolha = JOptionPane.showInputDialog("Digite um TIPO para listar os Pokémons").toUpperCase();
                String lista = "Tipo escolhido: " + escolha + "\nPokémons encontrados:\n";
                boolean achou = false;

                for (String key : pokemon.keySet()){
                    if(pokemon.get(key).equals(escolha)){
                        lista += "- " + key + "\n";
                        achou = true;
                    }
                }
                if(!achou) {
                    lista += "(nenhum Pokémon desse tipo cadastrado)";
                }
                JOptionPane.showMessageDialog(null, lista);

            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa. Até breve!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}