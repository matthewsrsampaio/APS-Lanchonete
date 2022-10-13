package Exercicio12;

public class Funcionario extends Pessoa {
    private String matricula;

    Funcionario () {}

    Funcionario (String nomeCompleto, String email, String matricula) {
        this.setNomeCompleto(nomeCompleto);
        this.setEmail(email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
