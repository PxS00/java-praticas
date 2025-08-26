package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Televisor tv = new Televisor();
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Informe o canal inicial (2, 4, 5, 7 ou 13): ");
            tv.setCanal(scan.nextInt());

            System.out.print("Informe o volume inicial (0 a 20): ");
            tv.setVolume(scan.nextInt());

            System.out.println("\nO que você deseja fazer?");
            System.out.println("1 - Definir outro canal");
            System.out.println("2 - Definir novo volume");
            System.out.println("3 - Aumentar volume");
            System.out.println("4 - Diminuir volume");
            System.out.print("Digite sua opção: ");

            int opcao = scan.nextInt();

            if (opcao == 1){
                System.out.print("Informe o novo canal (2, 4, 5, 7 ou 13): ");
                tv.setCanal(scan.nextInt());

            } else if (opcao == 2) {
                System.out.print("Informe o novo volume (0 a 20): ");
                tv.setVolume(scan.nextInt());

            } else if (opcao == 3) {
                tv.aumentarVolume();

            } else if (opcao == 4) {
                tv.diminuirVolume();

            } else {
                System.out.println("Opção inválida.");
            }
            System.out.printf("\nSituação atual da Tv:\nCanal: %d\nVolume: %d", tv.getCanal(), tv.getVolume());

        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }

    }
}

