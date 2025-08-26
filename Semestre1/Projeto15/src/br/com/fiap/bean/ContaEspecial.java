package br.com.fiap.bean;

/**
 *  Classe para criar objetos do tipo <strong>ContaEspecial</strong>
 *  @author Lucas Rossoni
 *  @version 1.0
 *  @since 21.0.7
 */
public class ContaEspecial implements ContaBancaria{
    // atributos
    private int numConta;
    private float saldo;
    private float limite;
    // construtor
    public ContaEspecial() {
    }
    // get/set
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
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
    // métodos
    /**
     * Método sacar que permite sacar um valor informado.
     * Valor informado não deve ser superior ao limite.
     * @author Lucas Rossoni
     * @param valor indica valor a ser sacado, mas possuí um valor limite que pode ser menor que o valor de saldo
     * @return float - valor do saldo (atualizado)
     */
    public float sacar(float valor) {
        try {
            float novoSaldo = getSaldo();
            if (valor <= (getSaldo() + limite)) {
                novoSaldo = getSaldo() - valor;
            } else {
                throw new Exception("Saldo Insuficiente!");
            }
            setSaldo(novoSaldo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return getSaldo();
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
