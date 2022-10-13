package POO06SET;

public class MeuProjetoPoo {

    public static void main(String[] args) {
        //Criando um objetos do tipo conta
        Conta contaA = new Conta(100);
        contaA.limite = 1000;
        contaA.numero = 123456;
        contaA.saldo = 10000;

        Conta contaB = new Conta(200);
        contaB.limite = 2000;
        contaB.numero = 654321;
        contaB.saldo = 20000;


        System.out.println("Saldo da conta A: " + contaA.valorSaldo());
        System.out.println("Saldo da conta B: " + contaB.valorSaldo());

        //Testando o valor padrão do atributo limite
        Conta contaC = new Conta(5);
        System.out.println(contaC.limite);
        //contaC.saldo = 50;
        System.out.println("Saldo conta c: " + contaC.saldo);

        //Agora posso criar um objeto de instancia vazia novamente; Com o construtor padrão.
        Conta contaD = new Conta();
        contaD.numero = 123;
    }
}
