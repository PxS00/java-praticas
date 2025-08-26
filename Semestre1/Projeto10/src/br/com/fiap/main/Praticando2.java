package br.com.fiap.main;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Praticando2 {
    public static void main(String[] args) {

        // Define o formato brasileiro de data: dia/mês/ano
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Recebe duas datas do usuário via caixa de diálogo
        String dataI = JOptionPane.showInputDialog("Me informe uma data de ínicio (d/m/a)");
        String dataF = JOptionPane.showInputDialog("Me informe uma data final (d/m/a)");

        try {
            // Usando substring para extrair partes da primeira data digitada
            String dia1 = dataI.substring(0, 2);  // Extrai os dois primeiros caracteres (dia)
            String mes1 = dataI.substring(3, 5);  // Extrai os caracteres do mês
            String ano1 = dataI.substring(6, 10); // Extrai os quatro caracteres do ano

            // Monta uma string no formato (ano-mês-dia), exigido pelo LocalDate
            String dataInicialFormatada = ano1 + "-" + mes1 + "-" + dia1;

            // Usando substring para extrair partes da segunda data digitada
            String dia2 = dataF.substring(0, 2);
            String mes2 = dataF.substring(3, 5);
            String ano2 = dataF.substring(6, 10);
            String dataFinalFormatada = ano2 + "-" + mes2 + "-" + dia2;

            // Converte as strings formatadas para objetos LocalDate
            LocalDate dataInicial = LocalDate.parse(dataInicialFormatada);
            LocalDate dataFinal = LocalDate.parse(dataFinalFormatada);

            // Calcula a diferença entre as duas datas
            Period periodo = Period.between(dataInicial, dataFinal);

            JOptionPane.showMessageDialog(null,String.format("Data inicial: %s \nData final: %s \nEntre as datas fornecidas existem %d ano(s), %d mês(es) e %d dia(s)!",
                    dataInicial.format(dtf), dataFinal.format(dtf), periodo.getYears(), periodo.getMonths(), periodo.getDays()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dados informados inválidos");
        }
    }
}
