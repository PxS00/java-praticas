package br.com.fiap.main;

import br.com.fiap.bean.ContaBancaria;
import br.com.fiap.exception.SaldoInsuficienteException;

public class UsaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);
        try {
            conta.sacar(1500);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
