package br.com.fiap.bean;

public class ArCondicionado {
    private int temperatura;
    private String modo;

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        try {
            if (temperatura >= 15 && temperatura <= 26){
                this.temperatura = temperatura;
            } else{
                throw new Exception("Temperatura fora da faixa permitida. (min = 15℃ até max = 26℃)");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        try {
            if (modo.equalsIgnoreCase("Fan") || modo.equalsIgnoreCase("Dry") || modo.equalsIgnoreCase("Cool") || modo.equalsIgnoreCase("Heat") || modo.equalsIgnoreCase("Auto")){
                this.modo = modo;
            }else {
                throw new Exception("Modo inválido. Os modos permitidos são: Cool, Auto, Heat, Fan ou Dry.");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void aumentarTemperatura(){
        if (temperatura < 26){
            temperatura++;
        }

    }
    public void diminuirTemperatura(){
        if (temperatura > 15){
            temperatura--;
        }
    }
}
