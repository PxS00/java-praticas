package br.com.fiap.bean;

public class Triangulo extends Quadrado{
    //atributos
    private float altura;

    // construtores
    public Triangulo() {
    }
    public Triangulo(float lado, float altura) {
        super(lado); // super.setLado(lado);
        this.altura = altura;
    }

    // métodos getters/setters
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    // métodos da classe
    public float calcularArea() {
        return super.getLado() * altura / 2;
    }
}

