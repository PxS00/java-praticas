package br.com.fiap;

public class Primitivo {
    public static void main(String[] args) {
        //declaração e inicialização (opcional) de variaveis
        char sexo = 'F'; //por ser caracter unico, se usa char e '', somente usados pro um unico caracter
        byte idade = 39; //por byte ser pequeno, idade é uma boa variavel inteira
        short codigo = 15650;
        int alunos = 50, classes = 11; // Por ser uma variavel do mesmo tipo, podem ser declaradas na mesma linha
        long brasileiros = 216635748788L;//(L) para numero muito grandes no long
        float media = 8.73f; //(f) é pra indicar q é um float
        double dolar = 5.69;//(.) padrao americano da (,)
        boolean alternativa = false;
        String nomeCompleto = "Lucas Rossoni Dieder";

        System.out.println("Nome: " + nomeCompleto + " Sexo: " + sexo + " Idade: " + idade + " anos");
        System.out.println("Código: " + codigo + " Média: " + media + " Alunos: " + alunos + " Turmas: " + classes);
        System.out.println("Habitantes: " + brasileiros + " Dólar U$ " + dolar + " Alterntiva: " + alternativa);

        int x = 5;
        x++; // aumenta +1
        x++; //aumenta +1
        System.out.println(x); //Vai dar 7

    }
}
