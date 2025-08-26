package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    // atributos
    private String nome;
    private LocalDate dataNascimento;

    // contrutores
    public Pessoa() {
    }

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    // métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        LocalDate inicio = LocalDate.parse("1899-12-31");
        LocalDate fim = LocalDate.now();
        try {
            if (dataNascimento.isAfter(inicio) && dataNascimento.isBefore(fim)) {
                this.dataNascimento = dataNascimento;
            } else {
                throw new Exception("Data fora da faixa permitida!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            System.exit(0); // encerrando o programa após o erro
        }
    }

    // métodos da classe (particulares)
    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now(); // pega a data atual
        Period idade = Period.between(dataNascimento, dataAtual); // faz o calculo
        return idade.getYears();
    }

}
