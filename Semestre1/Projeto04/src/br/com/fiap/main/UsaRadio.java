package br.com.fiap.main;

import br.com.fiap.bean.Radio;

public class UsaRadio {
    public static void main(String[] args) {
       //Radio radio; // declaração do objeto radio
        //radio = new Radio(); // instanciação do objeto

        Radio radio = new Radio();
        radio.estacao = 89.1f;
        radio.volume = 5;
        radio.trocarEstacao(92.5f);
        radio.aumentarVolume();
        radio.aumentarVolume();
        System.out.println("Volume atual: " + radio.volume + "\nEstação atual: " + radio.estacao);
    }
}
