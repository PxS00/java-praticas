package br.com.fiap.bean;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double quantia) throws SaldoInsuficienteException{
        if (quantia > saldo){
            throw new SaldoInsuficienteException("Sldo insuficiente para realizar o saque");// Lançamento explicito da exceção
        }
    }
}
