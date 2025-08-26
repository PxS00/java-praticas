package br.com.fiap;

import java.util.Scanner;

public class Exercicio2Sanner {
    public static void main(String[] args) {
        int anoAtual = 0, anoNascimento = 0, idade = 0;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.print("Me informe o ano atul: ");
            anoAtual = scan.nextInt();

            System.out.print("Me informe o ano do nascimento: ");
            anoNascimento = scan.nextInt();

            idade = anoAtual - anoNascimento;
            System.out.println("Você tem" + idade + "anos");
        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }
    }
}

