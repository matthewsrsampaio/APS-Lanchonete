public class Hamburguer extends Comida {

    private String tipoHamburguer;

    public String getTipoHamburguer() {
        return tipoHamburguer;
    }

    public void setTipoHamburguer(String tipoHamburguer) {
        this.tipoHamburguer = tipoHamburguer;
    }

    @Override
    public void pedido(double preco, boolean takeaway, String porcao, String sabor, String tipo) {
        this.setPreco(preco);
        this.setTamanhoPorcao(porcao);
        this.setTipoHamburguer(sabor);
        this.setTakeAway(takeaway);
        this.setComerFora(this.isTakeAway() ? "SIM" : "NÃO");
        this.setTipo(tipo);
    }

    public String burger1() {
        this.setTipo("Hamburguer");
        this.setTipoHamburguer("BigSkinnyBarra");
        this.setTamanhoPorcao("G");
        this.setTakeAway(false);
        this.setComerFora(this.isTakeAway() ? "SIM" : "NÃO");
        this.setPreco(19.5);
        return
                "Seu pedido foi concluído com sucesso.\nSTATUS DO PEDIDO\n" +
                "Tipo de comida: " + this.getTipo() + " \n" +
                "Tipo de hamburguer: " + this.getTipoHamburguer() + " \n" +
                "Tamanho do burguer: " + this.getTamanhoPorcao() + " \n" +
                "Comer fora: " + this.getComerFora() + " \n" +
                "Preco: R$" + this.getPreco();
    }

    public String burger2() {
        this.setTipo("Hamburguer");
        this.setTipoHamburguer("JoanderBurger");
        this.setTamanhoPorcao("M");
        this.setTakeAway(true);
        this.setComerFora(this.isTakeAway() ? "SIM" : "NÃO");
        this.setPreco(15.2);
        return
                "Seu pedido foi concluído com sucesso.\nSTATUS DO PEDIDO\n" +
                "Tipo de comida: " + this.getTipo() + " \n" +
                "Tipo de hamburguer: " + this.getTipoHamburguer() + " \n" +
                "Tamanho do burguer: " + this.getTamanhoPorcao() + " \n" +
                "Comer fora: " + this.getComerFora() + " \n" +
                "Preco: R$" + this.getPreco();
    }

    public String burger3() {
        this.setTipo("Hamburguer");
        this.setTipoHamburguer("ChunkyCommunistBurger");
        this.setTamanhoPorcao("GG");
        this.setTakeAway(true);
        this.setComerFora(this.isTakeAway() ? "SIM" : "NÃO");
        this.setPreco(22.7);
        return
                "Seu pedido foi concluído com sucesso.\nSTATUS DO PEDIDO\n" +
                "Tipo de comida: " + this.getTipo() + " \n" +
                "Tipo de hamburguer: " + this.getTipoHamburguer() + " \n" +
                "Tamanho do burguer: " + this.getTamanhoPorcao() + " \n" +
                "Comer fora: " + this.getComerFora() + " \n" +
                "Preco: R$" + this.getPreco();
    }

    @Override
    public String emitirIngredientes() {
        return
                "\nInformações do hamburguer";
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

//    @Override
//    public String toString() {
//        return
//                "Tipo de comida: " + this.getTipo() + " \n" +
//                "Tipo de hamburguer: " + this.getTipoHamburguer() + " \n" +
//                "Tamanho do burguer: " + this.getTamanhoPorcao() + " \n" +
//                "Comer fora: " + this.getComerFora() + " \n" +
//                "Preco: R$" + this.getPreco();
//    }

}
