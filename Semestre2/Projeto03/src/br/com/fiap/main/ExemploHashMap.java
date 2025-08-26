package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<>();
        do{
            try {
                String sigla, estado;
                // Cadastro de sigla e estado
                do{
                    sigla = JOptionPane.showInputDialog("Digite uma Unidade Federal (UF) de um estado ou digite \"fim\" para encerrar").toUpperCase();
                    if (!sigla.equals("FIM")) {
                        if(mapa.containsKey(sigla)){
                            JOptionPane.showMessageDialog(null, "Estado já cadastrado!");
                        }else {
                        estado = JOptionPane.showInputDialog("Digite o nome completo deste estado");
                        mapa.put(sigla, estado);
                        }
                    }
                } while(!sigla.equals("FIM"));
                // Buscando pelo nome de um estado a partir de sua sigla

                String escolha = JOptionPane.showInputDialog("Digite uma UF a sua escolha").toUpperCase();
                if (mapa.containsKey(escolha)) {
                    JOptionPane.showMessageDialog(null, "O nome completo deste estado é: " + mapa.get(escolha));
                }else {
                    JOptionPane.showMessageDialog(null, "Estado não cadastrado!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa. Até breve!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
