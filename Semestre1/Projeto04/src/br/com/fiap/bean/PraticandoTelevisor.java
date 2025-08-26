package br.com.fiap.bean;

public class PraticandoTelevisor {
    public int volume;
    public int canal;
    public void aumentarVolume(){volume++;}
    public void diminuirVolume(){volume--;}
    public void trocarCanal(int novoCanal){canal = novoCanal;}
}
