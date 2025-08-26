package br.com.fiap.main;

public class Exemplo1 {
    public static void main(String[] args) {
        try{
            int resultado = 10 / 5;
        } catch (ArithmeticException e) {
            System.out.println("Erro" + e.getMessage());;
        } finally {
            System.out.println("Fim do Programa");
        }

    }
}