package POO06SET;

public class Conta {
    public int numero;
    public float saldo;
    public float limite = 500;

    //O que acontece com os construtores abaixo é uma sobrecarga de construtores

    //Construtor padrão; Permite que haja instanciação.
    public Conta() {

    }

    //Construtor (recebe um valor e atribui ao atributo saldo)
    public Conta(float saldoInicial) {
        saldo = saldoInicial;
    }

    //Construtor sobrecarregado; Recebe valores para saldo e limite.
    public Conta (float saldoInicial, float limiteInicial) {
        saldo = saldoInicial;
        limite = limiteInicial;
    }

    public float valorSaldo() {
        return this.saldo;
    }

}
