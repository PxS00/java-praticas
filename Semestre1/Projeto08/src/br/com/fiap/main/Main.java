package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        Scanner scan = new Scanner(System.in);


        try {
            System.out.print("Escolha um modo e defina a temperatura: ");
            ar.setModo(scan.next());
            ar.setTemperatura(scan.nextInt());

            System.out.println("\nO que você deseja fazer? \n(1) Mudar de modo \n(2)Aumentar Temperatura \n(3) Diminuir Temperatura");
            int opcao = scan.nextInt();

            if (opcao == 1){
                System.out.println("Digite o novo modo: ");
                ar.setModo(scan.next());
            } else if (opcao == 2) {
                System.out.println("Aumentando Temperatura");
                ar.aumentarTemperatura();
            } else {
                System.out.println("Diminuindo Temperatura..");
                ar.diminuirTemperatura();
            }

            System.out.printf("Modo atual: %s \nTemperatura atual: %d", ar.getModo(), ar.getTemperatura());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
