public class Pizza extends Comida{
    private String sabor;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void pedido(double preco, boolean takeaway, String porcao, String sabor) {
        this.setPreco(preco);
        this.setTamanhoPorcao(porcao);
        this.setSabor(sabor);
        this.setTakeAway(takeaway);
        this.setComerFora(this.isTakeAway() ? "SIM" : "NÃO");
    }

    @Override
    public String toString() {
        return
                "Pizza: " + this.getSabor() + "\n" +
                "Tamanho da Porção: " + this.getTamanhoPorcao() + "\n" +
                "Comer fora: " + this.getComerFora() + "\n" +
                "Preço: R$" + this.getPreco() + "\n";
    }
}
