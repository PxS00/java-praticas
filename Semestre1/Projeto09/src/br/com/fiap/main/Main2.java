package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Pessoa pessoa1;
        Scanner scan;
        // String nome;
        // int anoNascimento;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite seu nome e ano de nascimento:");
            // nome = scan.nextLine(); // para ler a linha inteira de resposta
            //noNascimento = scan.nextInt();

            pessoa1 = new Pessoa(scan.nextLine(), scan.nextInt());
            //int idadePessoa1 = pessoa1.calcularIdade(2025);

            System.out.printf("Pessoa 1 \n Nome: %s \n Idade: %d anos", pessoa1.getNome(), pessoa1.calcularIdade(2025));

        } catch (Exception e) {
            System.out.println("Nome ou ano de nascimento inválido(s).");
        }
    }
}
