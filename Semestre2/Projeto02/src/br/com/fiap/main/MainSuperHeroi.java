package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class MainSuperHeroi {
    public static void main(String[] args) {
        SuperHeroi super1;
        String nome, idSecreta, auxiliar;

        do {
            try {
                nome = JOptionPane.showInputDialog("Nome do Herói");
                idSecreta = JOptionPane.showInputDialog("Identidade Secreta");
                ArrayList<String> poderes = new ArrayList<>();
                ArrayList<String> fraquezas = new ArrayList<>();
                String opcao;
                while (true) {
                    opcao = JOptionPane.showInputDialog(
                            "Digite um Poder deste super-herói\nOu digite 'próximo' para passar"
                    );
                    if (opcao.equalsIgnoreCase("próximo")) {
                        break;
                    }
                    poderes.add(opcao);
                }

                while (true) {
                    opcao = JOptionPane.showInputDialog(
                            "Digite uma fraqueza deste super-herói\nOu digite 'fim' para encerrar"
                    );
                    if (opcao.equalsIgnoreCase("fim")) {
                        break; 
                    }
                    fraquezas.add(opcao);
                }
                super1 = new SuperHeroi(nome, idSecreta, poderes, fraquezas);
                super1.listarHeroi();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa. Até breve!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
