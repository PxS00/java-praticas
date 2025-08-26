package br.com.fiap.main;
import br.com.fiap.bean.Equipe;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class MainEquipe {
    public static void main(String[] args) {
        Equipe grupo;
        String nome, auxiliar;

        do {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome da equipe");
                ArrayList<String> integrantes = new ArrayList<>();
                String membro = "continua";
                while(membro.equalsIgnoreCase("continua")){
                    auxiliar = JOptionPane.showInputDialog("Digite um integrante desta equipe ou digite \"fim\" para encerrar");
                    if (auxiliar.equalsIgnoreCase("fim")) {
                        membro = "fim";
                    }else{
                        integrantes.add(auxiliar);
                    }
                }
                grupo = new Equipe(nome, integrantes);
                grupo.listarEquipe();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa. Até breve!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
