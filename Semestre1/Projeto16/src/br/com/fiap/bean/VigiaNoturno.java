package br.com.fiap.bean;
/**
 * Classe para objetos do tipo VigiaNoturno
 * essa classe implementa a interface Funcionario
 * @author Lucas
 * @version 1.0
 */

public class VigiaNoturno implements Funcionario {
    private String nome;
    private float valorHoraTrabalho;
    private float adicionalNoturno;

    public VigiaNoturno() {}

    public VigiaNoturno(String nome, float valorHoraTrabalho, float adicionalNoturno) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.adicionalNoturno = adicionalNoturno;
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

    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }
    /**
     * Método calcularSalario que retorna o valor do salário
     * deste tipo de funcionário (VigiaNoturno)
     * @author Astrogildo
     * @return float - retorna o valor do salário
     */
    public float calcularSalario() {
        return (valorHoraTrabalho * 40) * 4 + adicionalNoturno;
    }
}
