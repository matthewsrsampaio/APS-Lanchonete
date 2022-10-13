package POO06SETExercicio;

public class Banco {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes();
        cliente1.nome = "Joao";
        cliente1.codCliente = 34232;

        Clientes cliente2 = new Clientes();
        cliente2.nome = "Carol";
        cliente2.codCliente = 8383;

        Clientes cliente3 = new Clientes("Marcos");
        cliente3.codCliente = 999;

        Clientes cliente4 = new Clientes("Tereza", 666);

        System.out.println("Nome do cliente 1: " + cliente1.nome);
        System.out.println("Código do cliente 1: " + cliente1.codCliente);
        System.out.println("Nome do cliente 2: " + cliente2.nome);
        System.out.println("Código do cliente 2: " + cliente2.codCliente);
        System.out.println("Nome do cliente 3: " + cliente3.nome);
        System.out.println("Código do cliente 3: " + cliente3.codCliente);
        System.out.println("Nome do cliente 4: " + cliente4.nome);
        System.out.println("Código do cliente 4: " + cliente4.codCliente);
        cliente4.nome = "Joanderson";

        System.out.println(cliente4.nome);


    }
}
