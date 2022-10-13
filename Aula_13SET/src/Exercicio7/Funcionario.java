package Exercicio7;

public class Funcionario {
    private String nome;
    private double salario;

    Funcionario() {}

    Funcionario(double salario) {
        this.salario = 200;
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

    public double reducaoSalario(double percentual) {
        if(percentual > 0) {
            this.salario += this.salario*(percentual/100);
        }
        return this.salario;
    }

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

}
