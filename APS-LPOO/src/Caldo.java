public class Caldo extends Comida {
    private String tipoCaldo;

    public String getTipoCaldo() {
        return tipoCaldo;
    }

    public void setTipoCaldo(String tipoCaldo) {
        this.tipoCaldo = tipoCaldo;
    }

    @Override
    public String caldo1() {
        this.setTipo("Caldo");
        this.setTipoCaldo("Best of Barra");
        this.setPreco(9.5);
        return
                "\nPedido Confirmado.\nObrigado!\n\nSTATUS DO PEDIDO\n" +
                "\nTipo de comida: " + this.getTipo() +
                "\nTipo de caldo: " + this.getTipoCaldo() +
                "\nPreco: R$" + this.getPreco();
    }

    @Override
    public String caldo2() {
        this.setTipo("Caldo");
        this.setTipoCaldo("M. Castelo's Super");
        this.setPreco(25.2);
        return
                "\nPedido Confirmado.\nObrigado!\n\nSTATUS DO PEDIDO\n" +
                "\nTipo de comida: " + this.getTipo() +
                "\nTipo de caldo: " + this.getTipoCaldo() +
                "\nPreco: R$" + this.getPreco();
    }

    @Override
    public String caldo3() {
        this.setTipo("Caldo");
        this.setTipoCaldo("Old Village's Best");
        this.setPreco(10);
        return
                "\nPedido Confirmado.\nObrigado!\n\nSTATUS DO PEDIDO\n" +
                "\nTipo de comida: " + this.getTipo() +
                "\nTipo de caldo: " + this.getTipoCaldo() +
                "\nPreco: R$" + this.getPreco();
    }

    @Override
    public String entrega(boolean takeAway) {
        return super.entrega(takeAway);
    }

    @Override
    public String emitirIngredientes_1() {
        return "\nFicha de ingredientes padrão: carne, abobrinha, coentro, tomate e cebola";
    }

    @Override
    public String emitirIngredientes_2() {
        return "\nFicha de ingredientes padrão: bode, tripas de bode e coleslaw";
    }

    @Override
    public String emitirIngredientes_3() {
        return "\nFicha de ingredientes padrão: ginsen, alfafa, carne de carangueijo e triglicerídeos";
    }
}
