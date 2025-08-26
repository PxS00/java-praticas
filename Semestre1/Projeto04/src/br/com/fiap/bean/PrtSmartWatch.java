package br.com.fiap.bean;

public class PrtSmartWatch {
    public String horas;
    public String modo;
    public boolean conectadoBluetooth;
    public int volume;
    public void aumentaVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void exibirHoras(){
        System.out.println("Hora atual: " + horas);
    }
    public void conectarBluetooth(){
        conectadoBluetooth = true;
    }
    public void trocarModo(String diferentesModos){
        modo = diferentesModos;
    }
}
