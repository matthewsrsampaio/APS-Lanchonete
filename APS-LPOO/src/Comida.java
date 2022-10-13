public class Comida {
    private String tamanhoPorcao;
    private boolean takeAway;
    private double preco;
    private String comerFora;

    public String getTamanhoPorcao() {
        return tamanhoPorcao;
    }

    public void setTamanhoPorcao(String tamanhoPorcao) {
        this.tamanhoPorcao = tamanhoPorcao;
    }

    public boolean isTakeAway() { return takeAway; }

    public void setTakeAway(boolean takeAway) {
        this.takeAway = takeAway;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getComerFora() {
        return comerFora;
    }

    public void setComerFora(String comerFora) {
        this.comerFora = comerFora;
    }

}
