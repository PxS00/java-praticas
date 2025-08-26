package br.com.fiap.bean;

/**
 * Classe para objetos do tipo Freelancer
 * essa classe implementa a interface Funcionario
 * @author Lucas
 * @version 1.0
 */

public class Freelancer implements Funcionario {
    private String nome;
    private float valorHoraTrabalho;

    public Freelancer() {}

    public Freelancer(String nome, float valorHoraTrabalho) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }

    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        this.valorHoraTrabalho = valorHoraTrabalho;
    }
    /**
     * Método calcularSalario que retorna o valor do salário
     * deste tipo de funcionário (Freelancer)
     * @author Astrogildo
     * @return float - retorna o valor do salário
     */
    public float calcularSalario() {
        return ((valorHoraTrabalho * 40) * 4) * 1.5f;
    }
}
