package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Lucas");
        pessoa1.setAnoNascimento(2005);
        int idadePessoa1 = pessoa1.calcularIdade(2025);

        // puxando do construtor com passagem de parâmetro
        Pessoa pessoa2 = new Pessoa("Anna", 2002);

        System.out.printf("Pessoa 1 \n Nome: %s \n Idade: %d anos", pessoa1.getNome(), idadePessoa1);
        System.out.printf("\nPessoa 2 \n Nome: %s \n Idade: %d anos", pessoa2.getNome(), pessoa2.calcularIdade(2025));
    }
}
