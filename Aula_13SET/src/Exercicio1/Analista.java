package Exercicio1;

public class Analista extends Pessoa{
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void definirSalario(float novoSalario) {
        this.salario = novoSalario;
    }

    public float consultarSalario() {
        return this.salario;
    }
}
