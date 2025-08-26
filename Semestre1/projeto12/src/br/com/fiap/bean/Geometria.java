package br.com.fiap.bean;

import javax.swing.*;

public class Geometria {
    // atributos
    private float lado;
    private float altura;
    private double raio;

    // construtores
    public Geometria() {
    }

    // métodos getters e setters
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    //métodos da classe (particulares)
    public void calcularArea(float lado){
        setLado(lado);
        float area = this.lado * this.lado;
        JOptionPane.showMessageDialog(null, String.format("Área do quadrado: %.2f", area));
    }
    public void calcularArea(float lado, float altura){
        setLado(lado);
        setAltura(altura);
        float area = this.lado * this.altura;
        JOptionPane.showMessageDialog(null, String.format("Área do retângulo: %.2f", area));
    }
    public void calcularArea(double raio){
        setRaio(raio);
        double area = Math.PI * Math.pow(this.raio, 2);
        JOptionPane.showMessageDialog(null, String.format("Área do círculo: %.2f", area));
    }
}


