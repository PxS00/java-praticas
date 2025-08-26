package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1;
        String auxiliar, nome, dataEUA;
        LocalDate dataNascimento;
        try {
            nome = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
            auxiliar = JOptionPane.showInputDialog("Digite data de nascimento (dd/MM/yyyy)");

            // arrumando a String no formato ano-mês-dia
            //0 1 2 3 4 5 6 7 8 9
            //1 5 / 0 3 / 1 9 9 8
            String ano = auxiliar.substring(6,10);
            String mes = auxiliar.substring(3,5);
            String dia = auxiliar.substring(0,2);
            dataEUA = ano + "-" + mes + "-" + dia; // 1998-03-15
            dataNascimento = LocalDate.parse(dataEUA);

            pessoa1 = new Pessoa(nome, dataNascimento);

            JOptionPane.showMessageDialog(null, String.format("Data formato EUA \nData nascimento: %s", pessoa1.getDataNascimento()));
            // formato Br
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            JOptionPane.showMessageDialog(null, String.format("Data Pessoais \nNome: %s \nData de Nascimento: %s \nIdade: %d anos", pessoa1.getNome(), pessoa1.getDataNascimento().format(dtf), pessoa1.calcularIdade()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

    }
}
