package br.com.fiap.bean;

public class Vendedor extends Funcionario {
    private float comissao;

    public Vendedor() {
    }
    public Vendedor(String nome, float valorHoraTrabalho, float comissao) {
        super(nome, valorHoraTrabalho);
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float calcularSalario () {
        return super.getValorHoraTrabalho() *
        (1 + comissao/100);
    }
}

