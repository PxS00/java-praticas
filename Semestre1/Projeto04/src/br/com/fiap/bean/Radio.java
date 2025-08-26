package br.com.fiap.bean;

public class Radio {
    //atributos - atributo não inicializa
    public int volume;
    public float estacao;

    // métodos
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void trocarEstacao(float frequencia){
        estacao = frequencia;
    }
}

