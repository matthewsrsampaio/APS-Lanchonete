public class Analista extends Pessoa{
    private float salario;

    public void definirSalario(float novoSalario) {
        this.salario = novoSalario;
    }

    public float consultarSalario() {
        return this.salario;
    }

}
