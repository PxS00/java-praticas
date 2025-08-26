package br.com.fiap.bean;

public class Caculadora {
    private float num1;
    private float num2;

    public Caculadora() {
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float adicao(){
        return num1 + num2;
    }
    public float subtracao(){
        return num1 - num2;
    }
    public float multiplicacao(){
        return num1 * num2;
    }
    public float divisao(){
        if (num2 == 0) {
            throw new ArithmeticException("Erro: divisão por zero");
        }
        return num1 / num2;
    }
}

