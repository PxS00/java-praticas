package br.com.fiap.main;

import br.com.fiap.bean.PraticandoTelevisor;

public class PrtUsaTelevisor {
    public static void main(String[] args) {
        PraticandoTelevisor tv = new PraticandoTelevisor();
        tv.volume = 25;
        tv.canal = 12;
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.trocarCanal(10);
        tv.diminuirVolume();
        System.out.println("Volume atual: " + tv.volume +
                "\nCanal atual: " + tv.canal);
    }
}
