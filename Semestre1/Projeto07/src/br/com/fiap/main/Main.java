package br.com.fiap.main;

import br.com.fiap.bean.Radio;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();

        radio.setVolume(55);
        radio.setEstacao(89.1f);
        radio.aumentarVolume();
        radio.aumentarVolume();
        radio.setEstacao(92.5f);
        System.out.printf("Estação: %.1fMHz \nVolume: %d", radio.getEstacao(), radio.getVolume());
    }
}

