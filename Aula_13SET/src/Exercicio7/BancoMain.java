package Exercicio7;

public class BancoMain {
    public static void main(String[] args) {

        //Conta 001
        Conta conta001 = new Conta();
        conta001.setNumero(012345);
        conta001.setLimite(1000.00);
        conta001.setSaldo(0);

        conta001.depositar(1000);
        conta001.sacar(300);
        conta001.getSaldo();

        //Funcionario
        Funcionario funcionario001 = new Funcionario();
        funcionario001.setNome("Matthews");
        funcionario001.alterarNome("Magao da Barra");
        funcionario001.aumentoSalario(500);
        System.out.println(funcionario001.getNome());

    }
}
