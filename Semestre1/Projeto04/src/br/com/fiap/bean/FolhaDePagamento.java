package br.com.fiap.bean;

public class FolhaDePagamento {
    //atributos
    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;

    //métodos
    public double calcularSalarioLiquido(){
        double desconto1, desconto2, salarioLiquido;
        desconto1 = salarioBruto * (descontoINSS / 100);
        desconto2 = valorPlanoDeSaude * (numeroDeDependentes + 1);
        salarioLiquido = salarioBruto - (desconto1 + desconto2);
        return salarioLiquido;
        //return (salarioBruto - descontoINSS) - valorPlanoDeSaude * (numeroDeDependentes + 1);
    }
}
