package br.com.fiap.bean;

import javax.swing.*;

public class SuperHeroi {
    private String nome;
    private String idSecreta;
    private String[] poderes;
    private String[] fraquezas;

    public SuperHeroi() {
    }

    public SuperHeroi(String nome, String idSecreta, String[] poderes, String[] fraquezas) {
        this.nome = nome;
        this.idSecreta = idSecreta;
        this.poderes = poderes;
        this.fraquezas = fraquezas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdSecreta() {
        return idSecreta;
    }
    public void setIdSecreta(String idSecreta) {
        this.idSecreta = idSecreta;
    }

    public String[] getPoderes() {
        return poderes;
    }
    public void setPoderes(String[] poderes) {
        this.poderes = poderes;
    }

    public String[] getFraquezas() {
        return fraquezas;
    }
    public void setFraquezas(String[] fraquezas) {
        this.fraquezas = fraquezas;
    }

    public void listarHeroi(){
        String exibe = String.format("Nome do Heroi: %s \n Identidade Secreta: %s \n", nome, idSecreta);
        for(String i : poderes) {
            exibe += String.format("Poderes: %s \n", i);
        }
        for(String i : fraquezas) {
            exibe += String.format("Fraquezas: %s \n", i);
        }
        JOptionPane.showMessageDialog(null, exibe, "Listagem de Super Herois",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
