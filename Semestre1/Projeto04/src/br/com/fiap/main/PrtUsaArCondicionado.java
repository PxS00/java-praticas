package br.com.fiap.main;

import br.com.fiap.bean.PrtArCondicionado;

public class PrtUsaArCondicionado {
    public static void main(String[] args) {
        PrtArCondicionado arCondicionado = new PrtArCondicionado();
        arCondicionado.modo = "resfriar";
        arCondicionado.temperatura = 21;
        arCondicionado.aumentarTemperatura();
        arCondicionado.aumentarTemperatura();
        arCondicionado.aumentarTemperatura();
        arCondicionado.trocarModo("aquecer");
        System.out.println("Modo atual: " + arCondicionado.modo +
                "\nTemperatura atual: " + arCondicionado.temperatura);
    }
}
