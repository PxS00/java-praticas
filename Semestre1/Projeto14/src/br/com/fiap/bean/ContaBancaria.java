package br.com.fiap.bean;

import javax.swing.*;

public class ContaBancaria {
    private String cliente;
    private int numConta;
    private float saldo;
    // construtores
    public ContaBancaria() {
    }
    // métodos getters/setters
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    // métodos da classe (particulares)
    public float sacar(float valor) {
        float novoSaldo = saldo;
        if (valor <= saldo) {
            novoSaldo = saldo - valor;
        } else {
            JOptionPane.showMessageDialog(null, "Valor superior ao seu saldo atual");
        }
        saldo = novoSaldo;
        return saldo;
    }
    public float depositar(float valor) {
        return saldo += valor;
    }
}

