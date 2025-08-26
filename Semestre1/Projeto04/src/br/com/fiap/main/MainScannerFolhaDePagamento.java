package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import java.util.Scanner;

public class MainScannerFolhaDePagamento {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.print("Me informe o salário bruto que você recebe: ");
            folha.salarioBruto = scan.nextDouble();

            System.out.print("Me informe o número de dependentes: ");
            folha.numeroDeDependentes = scan.nextInt();

            System.out.print("Me informe o desconto do INSS: ");
            folha.descontoINSS = scan.nextDouble();

            System.out.print("Me informe o valor do plano de saúde: ");
            folha.valorPlanoDeSaude = scan.nextDouble();

            System.out.printf("\n\nInformações da folha de pagamento \nSalário Bruto: R$ %.2f \nNºde Dependentes: %d \nINSS: %.1f%%" +
                    "\nPlano de Saúde: R$ %.2f \nSalário Líquido: R$ %.2f ",folha.salarioBruto, folha.numeroDeDependentes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());
        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }
    }
}
