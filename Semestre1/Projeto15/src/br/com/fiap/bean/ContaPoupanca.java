package br.com.fiap.bean;

/**
 * Classe para criar objetos do tipo <strong>ContaPoupanca</strong>
 * @author Lucas Rossoni
 * @version 1.0
 * @since 21.0.7
 */
public class ContaPoupanca implements ContaBancaria {
    // atributos
    private int numConta;
    private float saldo;
    // contrutores
    public ContaPoupanca() {
    }
    // métodos getters/setters
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
    /**
     * Método sacar que permite sacar um valor informado.
     * Valor informado não deve ser superior ao saldo atual.
     * @author Lucas Rossoni
     * @param valor indica valor a ser sacado
     * @return float - valor do saldo (atualizado)
     */
    public float sacar(float valor) {
        try {
            if (valor <= saldo) {
                saldo -= valor;  // saldo = saldo - valor;
            } else {
                throw new Exception("Saldo Insuficiente!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return saldo;
    }

    /**
     * Método depositar que permite depositar um valor informado.
     * @author Lucas Rossoni
     * @param valor indica valor a ser depositado.
     * @return float - valor do saldo (atualizado)
     */
    public float depositar(float valor) {
        saldo += valor;  // saldo = saldo + valor;
        return saldo;
    }
}
