package Exercicio12;

public class Professor extends Funcionario {
    private String nivel;

    Professor (String nomeCompleto, String email, String matricula, String nivel) {
        this.setNomeCompleto(nomeCompleto);
        this.setEmail(email);
        this.setMatricula(matricula);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
