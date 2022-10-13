package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Analista analista = new Analista();
        analista.definirDados("Matthews", "928272");

        System.out.println("Nome do analista: "+ analista.getNome() + "\nCPF: "+analista.getCpf());

    }
}
