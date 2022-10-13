package Exercicio11_Banco;

public class Funcionario {
    private String nome;
    private double salario;

    Funcionario () {}

    Funcionario (double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentoSalario(double percentual) {
        if(percentual > 0) {
            this.salario += this.salario*(percentual/100);
        }
        return this.salario;
    }

}
