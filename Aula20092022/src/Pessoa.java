public class Pessoa {
    private String nome;
    private String cpf;

    public void definirDados(String novoNome, String novoCPF) {
        this.nome = novoNome;
        this.cpf = novoCPF;
    }

    public String consultarNome() {
        return nome;
    }

    public String consultarCPF() {
        return cpf;
    }

}
