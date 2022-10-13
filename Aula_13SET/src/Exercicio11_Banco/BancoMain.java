package Exercicio11_Banco;

public class BancoMain {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(1000.0);
        funcionario.aumentoSalario(30);
        System.out.println("Novo salario e de: "+funcionario.getSalario());
    }
}
