package Exercicio7;

public class Conta {
    private int numero;
    private double limite;
    private double saldo;

    Conta() {}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Método de depósito
    public void depositar (double deposito) {
        this.saldo += deposito;
    }

    //Método de saque
    public void sacar(double saque) {
        this.saldo -= saque;
    }



}
