package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;

import javax.swing.JOptionPane;

public class MainSuperHeroi {

    public static void main(String[] args) {
        SuperHeroi super1;
        String nome, idSecreta;
        String[] poderes, fraquezas;
        int qtde;
        do {
            try {
                nome = JOptionPane.showInputDialog("Nome do Herói");
                idSecreta = JOptionPane.showInputDialog("Identidade Secreta");
                qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de poderes"));
                poderes = new String[qtde];
                for (int i = 0; i < poderes.length; i++) {
                    poderes[i] = JOptionPane.showInputDialog(String.format("Poder %d:", (i + 1)));
                }
                qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de fraquezas"));
                fraquezas = new String[qtde];
                for (int i = 0; i < fraquezas.length; i++) {
                    fraquezas[i] = JOptionPane.showInputDialog(String.format("Fraqueza %d:", (i + 1)));
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