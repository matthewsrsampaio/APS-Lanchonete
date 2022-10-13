package Exercicio1;

public class Desenvolver extends Pessoa{
    private float valorHora;

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public void definirValorHora(float novoValorHora) {
        this.valorHora = novoValorHora;
    }

    public float consultarValorHora() {
        return this.valorHora;
    }
}
