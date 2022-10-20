public class Caldo extends Comida{
    private String tipoCaldo;

    public String getTipoCaldo() {
        return tipoCaldo;
    }

    public void setTipoCaldo(String tipoCaldo) {
        this.tipoCaldo = tipoCaldo;
    }

    @Override
    public void pedido(double preco, boolean takeaway, String porcao, String tipoCaldo, String tipo) {
        this.setPreco(preco);
        this.setTamanhoPorcao(porcao);
        this.setTipoCaldo(tipoCaldo);
        this.setTakeAway(takeaway);
        this.setComerFora(this.isTakeAway() ? "SIM" : "NÃO");
        this.setTipo(tipo);
    }

    public String caldo1() {
        this.setTipo("Caldo");
        this.setTipoCaldo("Best of Barra");
        this.setTamanhoPorcao("G");
        this.setTakeAway(false);
        this.setComerFora(this.isTakeAway() ? "SIM" : "NÃO");
        this.setPreco(9.5);
        return
                "Seu pedido foi concluído com sucesso.\nSTATUS DO PEDIDO\n" +
                "Tipo de comida: " + this.getTipo() + " \n" +
                "Tipo de caldo: " + this.getTipoCaldo() + " \n" +
                "Tamanho do caldo: " + this.getTamanhoPorcao() + " \n" +
                "Comer fora: " + this.getComerFora() + " \n" +
                "Preco: R$" + this.getPreco();
    }

    public String caldo2() {
        this.setTipo("Caldo");
        this.setTipoCaldo("M. Castelo's Super");
        this.setTamanhoPorcao("GG");
        this.setTakeAway(false);
        this.setComerFora(this.isTakeAway() ? "SIM" : "NÃO");
        this.setPreco(25.2);
        return
                "Seu pedido foi concluído com sucesso.\nSTATUS DO PEDIDO\n" +
                "Tipo de comida: " + this.getTipo() + " \n" +
                "Tipo de caldo: " + this.getTipoCaldo() + " \n" +
                "Tamanho do caldo: " + this.getTamanhoPorcao() + " \n" +
                "Comer fora: " + this.getComerFora() + " \n" +
                "Preco: R$" + this.getPreco();
    }

    public String caldo3() {
        this.setTipo("Caldo");
        this.setTipoCaldo("Old Village's best");
        this.setTamanhoPorcao("M");
        this.setTakeAway(false);
        this.setComerFora(this.isTakeAway() ? "SIM" : "NÃO");
        this.setPreco(10);
        return
                "Seu pedido foi concluído com sucesso.\nSTATUS DO PEDIDO\n" +
                "Tipo de comida: " + this.getTipo() + " \n" +
                "Tipo de caldo: " + this.getTipoCaldo() + " \n" +
                "Tamanho do caldo: " + this.getTamanhoPorcao() + " \n" +
                "Comer fora: " + this.getComerFora() + " \n" +
                "Preco: R$" + this.getPreco();
    }

    @Override
    public String emitirIngredientes() {
        return
                "\nInformações do caldo";
    }

    @Override
    public String emitirIngredientes_1() {
        return
                "\nFicha de ingredientes: carne, abobrinha, coentro, tomate e cebola";
    }

    @Override
    public String emitirIngredientes_2() {
        return
                "\nFicha de ingredientes: bode, tripas de bode e coleslaw";
    }

    @Override
    public String emitirIngredientes_3() {
        return
                "\nFicha de ingredientes: ginsen, alfafa, carne de carangueijo e triglicerídeos";
    }

//    @Override
//    public String toString() {
//        return
//                "Tipo de comida: " + this.getTipo() + "\n" +
//                        "Sabor do caldo: " + this.getTipoCaldo() + "\n" +
//                        "Tamanho do caldo: " + this.getTamanhoPorcao() + "\n" +
//                        "Comer fora: " + this.getComerFora() + "\n" +
//                        "Preço: R$" + this.getPreco() + "\n";
//    }
}
