public class Caldo extends Comida{
    private String tipoCaldo;

    public String getTipoCaldo() {
        return tipoCaldo;
    }

    public void setTipoCaldo(String tipoCaldo) {
        this.tipoCaldo = tipoCaldo;
    }

    public void pedido(double preco, boolean takeaway, String porcao, String tipoCaldo) {
        this.setPreco(preco);
        this.setTamanhoPorcao(porcao);
        this.setTipoCaldo(tipoCaldo);
        this.setTakeAway(takeaway);
        this.setComerFora(this.isTakeAway() ? "SIM" : "NÃO");
    }

    @Override
    public String toString() {
        return
                "Caldo: " + this.getTipoCaldo() + "\n" +
                "Tamanho da Porção: " + this.getTamanhoPorcao() + "\n" +
                "Comer fora: " + this.getComerFora() + "\n" +
                "Preço: R$" + this.getPreco() + "\n";
    }
}
