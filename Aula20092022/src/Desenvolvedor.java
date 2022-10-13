public class Desenvolvedor extends Pessoa {
    private float valorHora;

    public void definirValorHora(float novoValorHora) {
        this.valorHora = novoValorHora;
    }

    public float consultarValorHora() {
        return this.valorHora;
    }

}
