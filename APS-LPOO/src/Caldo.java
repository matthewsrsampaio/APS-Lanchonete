public class Caldo extends Comida implements comum{
    private String tipoCaldo;

    public String getTipoCaldo() {
        return tipoCaldo;
    }

    public void setTipoCaldo(String tipoCaldo) {
        this.tipoCaldo = tipoCaldo;
    }

    public String caldo1() {
        this.setTipo("Caldo");
        this.setTipoCaldo("Best of Barra");
        this.setPreco(9.5);
        return
                "Pedido Confirmado.\nObrigado!\n\nSTATUS DO PEDIDO\n" +
                        "Tipo de comida: " + this.getTipo() + " \n" +
                        "Tipo de caldo: " + this.getTipoCaldo() + " \n" +
                        "Preco: R$" + this.getPreco();
    }

    public String caldo2() {
        this.setTipo("Caldo");
        this.setTipoCaldo("M. Castelo's Super");
        this.setPreco(25.2);
        return
                "Pedido Confirmado.\nObrigado!\n\nSTATUS DO PEDIDO\n" +
                        "Tipo de comida: " + this.getTipo() + " \n" +
                        "Tipo de caldo: " + this.getTipoCaldo() + " \n" +
                        "Preco: R$" + this.getPreco();
    }

    public String caldo3() {
        this.setTipo("Caldo");
        this.setTipoCaldo("Old Village's best");
        this.setPreco(10);
        return
                "Pedido Confirmado.\nObrigado!\n\nSTATUS DO PEDIDO\n" +
                        "Tipo de comida: " + this.getTipo() + " \n" +
                        "Tipo de caldo: " + this.getTipoCaldo() + " \n" +
                        "Preco: R$" + this.getPreco();
    }

    @Override
    public String entrega(boolean takeAway) {
        return super.entrega(takeAway);
    }

    @Override
    public String emitirIngredientes_1() {
        return
                "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" +
                        "\n* Ficha de ingredientes padrão: carne, abobrinha, coentro, tomate e cebola +" +
                        "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
    }

    @Override
    public String emitirIngredientes_2() {
        return
                "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" +
                        "\n+ Ficha de ingredientes padrão: bode, tripas de bode e coleslaw +" +
                        "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
    }

    @Override
    public String emitirIngredientes_3() {
        return
                "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" +
                        "\n+ Ficha de ingredientes padrão: ginsen, alfafa, carne de carangueijo e triglicerídeos +" +
                        "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
    }
}
