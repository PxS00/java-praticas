package br.com.fiap.bean;

import javax.swing.*;

public class ContaEspecial extends ContaBancaria {
    // atributos
    private float limite;
    // construtores
    public ContaEspecial() {
    }
    // métodos getters/setters
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
    // métodos da classe (particulares)
    public float sacar(float valor) {
        float novoSaldo = super.getSaldo();
        if (valor <= (novoSaldo + limite)) {
            novoSaldo = novoSaldo - valor;
        } else {
            JOptionPane.showMessageDialog(null, "Valor superior ao seu limite atual");
        }
        super.setSaldo(novoSaldo);
        return super.getSaldo();
    }
}
