package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import javax.swing.*;

public class MainJOption {
    public static void main(String[] args) {

        FolhaDePagamento folha = new FolhaDePagamento();
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Me informe o salário bruto que você recebe");
            folha.salarioBruto = Double.parseDouble(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Me informe o número de dependentes");
            folha.numeroDeDependentes = Integer.parseInt(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Me informe o desconto do INSS");
            folha.descontoINSS = Double.parseDouble(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Me informe o valor do plano de saúde");
            folha.valorPlanoDeSaude = Double.parseDouble(auxiliar);

            String resultado = String.format("Informações da folha de pagamento \nSalário Bruto: R$ %.2f \nNºde Dependentes: %d \nINSS: %.1f%%" +
                    "\nPlano de Saúde: R$ %.2f \nSalário Líquido: R$ %.2f ",folha.salarioBruto, folha.numeroDeDependentes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());

            JOptionPane.showMessageDialog(null, resultado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto");

        }
    }
}

