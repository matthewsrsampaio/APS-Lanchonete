package Exercicio1;

public class Pessoa {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void definirDados(String novoNome, String novoCpf) {
        this.nome = novoNome;
        this.cpf = novoCpf;
    }

    private String consultarNome() {
        return this.nome;
    }

    public String consultarCpf() {
        return this.cpf;
    }

}
