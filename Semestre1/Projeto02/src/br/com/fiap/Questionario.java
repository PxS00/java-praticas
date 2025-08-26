package br.com.fiap;

public class Questionario {
    public static void main(String[] args) {

        System.out.println(
                """
                        Explique Orientação à Objetos:
                        R: É um paradigma de programação baseado em objetos, que representam entidades do mundo real. Ele facilita a organização do código, reutilização e manutenção.
                        
                        Explique o que é objeto:
                        R: É uma instância de uma classe. Um objeto possui atributos (características) e métodos (ações ou comportamentos).
                        
                        Explique o que é classe:
                        R: É um molde ou estrutura que define os atributos e comportamentos dos objetos. Ela serve como um plano para criar objetos.
                        
                        Explique o que é abstração:
                        R: É o princípio de ocultar os detalhes complexos e mostrar apenas o necessário. Ajuda a focar no que é importante e facilita o uso dos objetos.
                        
                        Explique o que é herança:
                        R: É o mecanismo que permite uma classe herdar atributos e métodos de outra. Isso promove a reutilização de código e cria uma hierarquia entre classes.
                        
                        Explique o que é encapsulamento:
                        R: É a prática de esconder os detalhes internos de uma classe, permitindo acesso controlado aos dados por meio de métodos públicos (getters e setters).
                        
                        Explique o que é polimorfismo:
                        R: É a capacidade de um mesmo método ter comportamentos diferentes dependendo do contexto. Isso torna o código mais flexível e reutilizável.
                        
                        Quais os principais tipos de polimorfismo? Explique cada um deles:
                        1. Polimorfismo de sobrecarga (overload): Quando métodos com o mesmo nome têm diferentes parâmetros dentro da mesma classe.
                        2. Polimorfismo de sobrescrita (override): Quando uma subclasse redefine o comportamento de um método herdado da superclasse."""
        );
    }
}