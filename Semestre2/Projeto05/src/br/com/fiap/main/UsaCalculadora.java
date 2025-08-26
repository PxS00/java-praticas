package br.com.fiap.main;

import br.com.fiap.bean.Caculadora;
import javax.swing.*;

public class UsaCalculadora {
    public static void main(String[] args) {
        Caculadora cal = new Caculadora();

        do {
            try {
                float num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número:"));
                float num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número:"));
                cal.setNum1(num1);
                cal.setNum2(num2);

                String operacao = JOptionPane.showInputDialog(
                        "Escolha a operação:\n" +
                                "1 - Soma\n" +
                                "2 - Subtração\n" +
                                "3 - Multiplicação\n" +
                                "4 - Divisão"
                );

                float resultado = 0;



                switch (operacao) {
                    case "1": resultado = cal.adicao(); break;
                    case "2": resultado = cal.subtracao(); break;
                    case "3": resultado = cal.multiplicacao(); break;
                    case "4": resultado = cal.divisao(); break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                        continue;
                }

                JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(
                null,
                "Deseja continuar?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Fim de programa. Até breve!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
