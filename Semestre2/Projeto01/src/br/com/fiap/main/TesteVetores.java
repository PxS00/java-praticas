package br.com.fiap.main;

public class TesteVetores {
    public static void main(String[] args) {
        // Assim se cria um vetor
        String [] carros = {"Subaru", "BMW", "Ford", "Mazda"}; // Array
        System.out.println(carros.length);
        System.out.println(carros[2]);

        int [] numeros = new int[3]; // ele sempre tera 3 espaços
        numeros[0] = 17;
        numeros[1] = 48;
        numeros[2] = 73;
//      numeros[3] = 44; Fora do limite do Vetor
//        System.out.println(String.format("%d %d %d", numeros[0], numeros[1], numeros[2]));

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // for-each
        for (String i : carros) {
            System.out.println(i);
        }
    }
}
