public class Hamburguer extends Comida {

    private String tipoHamburguer;

    public String getTipoHamburguer() {
        return tipoHamburguer;
    }

    public void setTipoHamburguer(String tipoHamburguer) {
        this.tipoHamburguer = tipoHamburguer;
    }

    public String burger1() {
        this.setTipo("Hamburguer");
        this.setTipoHamburguer("BigSkinnyBarra");
        this.setTakeAway(false);
        this.setPreco(19.5);
        return
                "\nSeu pedido foi concluído com sucesso.\nSTATUS DO PEDIDO\n" +
                "\nTipo de comida: " + this.getTipo() +
                "\nTipo de hamburguer: " + this.getTipoHamburguer() +
                "\nPreco: R$" + this.getPreco();
    }

    public String burger2() {
        this.setTipo("Hamburguer");
        this.setTipoHamburguer("Joander'sBurger");
        this.setTakeAway(true);
        this.setPreco(15.2);
        return
                "\nSeu pedido foi concluído com sucesso.\nSTATUS DO PEDIDO\n" +
                "\nTipo de comida: " + this.getTipo() +
                "\nTipo de hamburguer: " + this.getTipoHamburguer() +
                "\nPreco: R$" + this.getPreco();
    }

    public String burger3() {
        this.setTipo("Hamburguer");
        this.setTipoHamburguer("ChunkyCommunistBurger");
        this.setTakeAway(true);
        this.setPreco(22.7);
        return
                "\nSeu pedido foi concluído com sucesso.\nSTATUS DO PEDIDO\n" +
                "\nTipo de comida: " + this.getTipo() +
                "\nTipo de hamburguer: " + this.getTipoHamburguer() +
                "\nPreco: R$" + this.getPreco();
    }

    @Override
    public String entrega(boolean takeAway) {
        return super.entrega(takeAway);
    }

    @Override
    public String emitirIngredientes_1() {
        return
                "\nFicha de ingredientes: 100g filé de magao, pão australiano, alface, gergilim";
    }

    @Override
    public String emitirIngredientes_2() {
        return
                "\nFicha de ingredientes: 50g filé de carneiro, pão brioche, alface, gergilim";
    }

    @Override
    public String emitirIngredientes_3() {
        return
                "\nFicha de ingredientes: 150g filé de babuíno, pão bengala, alface, gergilim";
    }

}
