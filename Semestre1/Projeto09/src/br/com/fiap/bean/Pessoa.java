package br.com.fiap.bean;
import java.time.LocalDate;

public class Pessoa {
    // Atributos
    private String nome;
    private int anoNascimento;

    // Construtor vazio
    public Pessoa() {
    }

    // Construtor com parâmetros (sem usar o setter)
    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        //this.anoNascimento = anoNascimento;
        setAnoNascimento(anoNascimento);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        LocalDate dataAtual = LocalDate.now();
        try {
            if (anoNascimento >= 1990 && anoNascimento <= dataAtual.getYear()) {
                this.anoNascimento = anoNascimento;
            } else {
                throw new Exception("Valor inválido! min = 1990 max = Ano atual");
            }
        } catch (Exception e) {
            System.out.println("Erro ao definir o ano de nascimento: " + e.getMessage());
        }
    }

    // Método da classe
    public int calcularIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }
}
