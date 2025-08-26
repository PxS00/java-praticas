package br.com.fiap;

import java.util.Scanner;

public class Exercicio1Scanner {
    public static void main(String[] args) {
        float prova1 = 0, prova2 = 0, prova3 = 0, prova4 = 0, media =0;
        Scanner scan;
        try {
           scan = new Scanner(System.in);
            System.out.print("Me informe a nota da Prova 1: ");
            prova1 = scan.nextFloat();
            if (prova1 > 10 || prova1 < 0) throw new Exception();

            System.out.print("Me informe a nota da Prova 2: ");
            prova2 = scan.nextFloat();
            if (prova2 > 10 || prova2 < 0) throw new Exception();

            System.out.print("Me informe a nota da Prova 3: ");
            prova3 = scan.nextFloat();
            if (prova3 > 10 || prova3 < 0) throw new Exception();

            System.out.print("Me informe a nota da Prova 4: ");
            prova4 = scan.nextFloat();
            if (prova4 > 10 || prova4 < 0) throw new Exception(); //throw new Exception() para oficializar

            media = (prova1 + prova2 + prova3 + prova4) / 4;
            System.out.println("Média: " + media);
        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }
    }
}


