package br.com.fiap;

public class Constante {
    public static void main(String[] args) {
        //declarando e inicializando constantes
        final double PI = 3.1415; //final pq nunca vai mudar, e constantes as variaveis se escrevem em maiusculo
        final float GRAVIDADE_TERRESTRE = 9.8f;

        // Sequência de Escape: \n (pula de linha)
        // Sequência de Escape: \t (tabulação)
        System.out.println("O valor de PI:\t\t" + PI + "\nGravidade da Terra: " + GRAVIDADE_TERRESTRE);

    }
}
