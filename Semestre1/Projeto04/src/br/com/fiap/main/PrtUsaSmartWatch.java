package br.com.fiap.main;

import br.com.fiap.bean.PrtSmartWatch;

public class PrtUsaSmartWatch {
    public static void main(String[] args) {
        PrtSmartWatch smartWatch = new PrtSmartWatch();
        smartWatch.horas = "10:36";
        smartWatch.volume = 75;
        smartWatch.modo = "casual";
        smartWatch.conectadoBluetooth = false;
        smartWatch.conectarBluetooth();
        smartWatch.exibirHoras();
        smartWatch.diminuirVolume();
        smartWatch.diminuirVolume();
        smartWatch.diminuirVolume();
        smartWatch.diminuirVolume();
        smartWatch.diminuirVolume();
        smartWatch.trocarModo("esportivo");
        System.out.println("Volume do seu dispositivo: " + smartWatch.volume +
                "\nModo do dispositivo: " + smartWatch.modo +
                "\nBluetooth conectado: " + smartWatch.conectadoBluetooth);
    }
}
