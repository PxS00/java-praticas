package br.com.fiap.bean;

public class Quadrado {
    //atributos
    private float lado;

    // construtores
    public Quadrado() {
    }
    public Quadrado(float lado){
        this.lado = lado;
    }

    // métodos getters/setters
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }

    // métodos da classe
    public float calcularArea() {
        return lado * lado;
    }
}
