public class TesteMain {
    public static void main(String[] args) {
        Servico servico = new Servico();
        Emprestimo emprestimo = new Emprestimo();
        Seguro seguro = new Seguro();

//        servico.dataDeContratacao = "02220909";
//        emprestimo.taxa = 0.8;
//        emprestimo.valor = 123;
//        seguro.franquia = 432;
//        seguro.valorDoSeguro = 500;
//
//        System.out.println("data de contratacao: "+ servico.dataDeContratacao);
//        System.out.println("taxa emprestimo "+emprestimo.taxa);
//        System.out.println("Valor emprestimo "+emprestimo.valor);
//        System.out.println("franquia seguro "+seguro.franquia);
//        System.out.println("valor seguro "+seguro.valorDoSeguro); 

        Pessoa pessoa = new Pessoa();
        pessoa.definirDados("Matthews", "028262623738");

        Analista analista = new Analista();
        analista.definirDados("Predo", "2321323");
        analista.definirSalario(1500);
    }
}
