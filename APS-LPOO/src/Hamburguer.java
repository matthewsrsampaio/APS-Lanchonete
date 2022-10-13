public class Hamburguer extends Comida{
    private String pontoCarne;
    private String tipoHamburguer;

    public String getPontoCarne() {
        return pontoCarne;
    }

    public void setPontoCarne(String pontoCarne) {
        this.pontoCarne = pontoCarne;
    }

    public String getTipoHamburguer() {
        return tipoHamburguer;
    }

    public void setTipoHamburguer(String tipoHamburguer) {
        this.tipoHamburguer = tipoHamburguer;
    }

    public void pedido(double preco, String porcao, boolean takeaway, String pontoCarne, String tipoHamburguer) {
        this.setPreco(preco);
        this.setPontoCarne(pontoCarne);
        this.setTipoHamburguer(tipoHamburguer);
        this.setTamanhoPorcao(porcao);
        this.setTakeAway(takeaway);
        this.setComerFora(this.isTakeAway() ? "SIM" : "NÃO");
    }

    @Override
    public String toString() {
        return
                "Hamburguer: " + this.getTipoHamburguer() + " \n" +
                "PontoCarne: " + this.getPontoCarne() + " \n" +
                "Tamanho da Porção: " + this.getTamanhoPorcao() + " \n" +
                "ComerFora: " + this.getComerFora() + " \n" +
                "Preco: R$" + this.getPreco();
    }

}
