package POO06SETExercicio;

public class Clientes {
    public String nome;
    public int codCliente;

    //Construtor vazio
    public Clientes() {}

    //construtor 1 parametro
    public Clientes(String nomeCliente) {
        nome = nomeCliente;
    }

    //Construtor sobrecarregado 2 parametros
    public Clientes(String nomeCliente, int codigoCliente) {
        nome = nomeCliente;
        codCliente = codigoCliente;
    }

    public void rson(){
        System.out.println("fdfd");
    }

}
