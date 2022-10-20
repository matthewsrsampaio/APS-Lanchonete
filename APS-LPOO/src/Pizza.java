public class Pizza extends Comida{
    private String sabor;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public void pedido(double preco, boolean takeaway, String porcao, String sabor, String tipo) {
        this.setPreco(preco);
        this.setTamanhoPorcao(porcao);
        this.setSabor(sabor);
        this.setTakeAway(takeaway);
        this.setComerFora(this.isTakeAway() ? "SIM" : "NÃO");
        this.setTipo(tipo);
    }

    public String pizza1() {
        this.setTipo("Pizza");
        this.setSabor("Barra 8 pieces");
        this.setTamanhoPorcao("G");
        this.setTakeAway(true);
        this.setComerFora(this.isTakeAway() ? "SIM" : "NÃO");
        this.setPreco(30.5);
        return
                "Seu pedido foi concluído com sucesso.\nSTATUS DO PEDIDO\n" +
                "Tipo de comida: " + this.getTipo() + " \n" +
                "Tipo de pizza: " + this.getSabor() + " \n" +
                "Tamanho do pizza: " + this.getTamanhoPorcao() + " \n" +
                "Comer fora: " + this.getComerFora() + " \n" +
                "Preco: R$" + this.getPreco();
    }

    public String pizza2() {
        this.setTipo("Pizza");
        this.setSabor("Barbas 10 Grand");
        this.setTamanhoPorcao("GG");
        this.setTakeAway(true);
        this.setComerFora(this.isTakeAway() ? "SIM" : "NÃO");
        this.setPreco(25.2);
        return
                "Seu pedido foi concluído com sucesso.\nSTATUS DO PEDIDO\n" +
                "Tipo de comida: " + this.getTipo() + " \n" +
                "Tipo de pizza: " + this.getSabor() + " \n" +
                "Tamanho do pizza: " + this.getTamanhoPorcao() + " \n" +
                "Comer fora: " + this.getComerFora() + " \n" +
                "Preco: R$" + this.getPreco();
    }

    public String pizza3() {
        this.setTipo("Pizza");
        this.setSabor("The Old Village's 16 Secrets");
        this.setTamanhoPorcao("GG");
        this.setTakeAway(false);
        this.setComerFora(this.isTakeAway() ? "SIM" : "NÃO");
        this.setPreco(45.99);
        return
                "Seu pedido foi concluído com sucesso.\nSTATUS DO PEDIDO\n" +
                "Tipo de comida: " + this.getTipo() + " \n" +
                "Tipo de pizza: " + this.getSabor() + " \n" +
                "Tamanho do pizza: " + this.getTamanhoPorcao() + " \n" +
                "Comer fora: " + this.getComerFora() + " \n" +
                "Preco: R$" + this.getPreco();
    }

    @Override
    public String emitirIngredientes() {
        return
                "\nInformações do pizza";
    }

    @Override
    public String emitirIngredientes_1() {
        return
                "\nFicha de ingredientes: carne de javali, massa crocante, queijo sensação, tomate e cebola";
    }

    @Override
    public String emitirIngredientes_2() {
        return
                "\nFicha de ingredientes: carne de bode desfiada, tripa crocante de bode e cogumelos neozelandeses cabreocráricos e hipinotizantes";
    }

    @Override
    public String emitirIngredientes_3() {
        return
                "\nFicha de ingredientes: queijo muçarela 1000 grau, alfafa, carne de carangueijo desfiada e triglicerídeos hipoglicemicos";
    }

//    @Override
//    public String toString() {
//        return
//                "Tipo de comida: " + this.getTipo() + "\n" +
//                        "Sabor da Pizza: " + this.getSabor() + "\n" +
//                        "Tamanho da Pizza: " + this.getTamanhoPorcao() + "\n" +
//                        "Comer fora: " + this.getComerFora() + "\n" +
//                        "Preço: R$" + this.getPreco() + "\n";
//    }
}
