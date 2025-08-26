package br.com.fiap;

import java.util.Scanner;

public class Exercicio3Sanner {
        public static void main(String[] args) {
            double raio = 0, aC = 0;
            final double PI = 3.1415;
            Scanner scan;
            try {
                scan = new Scanner(System.in);
                System.out.print("Me informe o raio de um círculo: ");
                raio = scan.nextInt();

                aC = PI * (raio * raio);
                //aC = Math.pow(raio, 2) * Math.PI;

                System.out.printf("A área desejada do círculo é: %.2f%n", aC);
            } catch (Exception e) {
                System.out.println("Formato de número incorreto!");
            }
        }
    }

