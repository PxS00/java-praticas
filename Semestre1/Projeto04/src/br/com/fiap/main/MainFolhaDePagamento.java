package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

public class MainFolhaDePagamento {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();
        folha.salarioBruto = 50000;
        folha.numeroDeDependentes = 4;
        folha.descontoINSS = 15;
        folha.valorPlanoDeSaude = 300;
        System.out.printf("Informações da folha de pagamento \nSalário Bruto: R$ %.2f \nNº de Dependentes: %d \nINSS: %.1f%% " +
                "\nPlano de Saúde: R$ %.2f \nSalário Líquido: R$ %.2f "
                , folha.salarioBruto, folha.numeroDeDependentes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());
    }
}
