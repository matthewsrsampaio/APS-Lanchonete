public class Pizza extends Comida implements comum{
    private String sabor;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) { this.sabor = sabor; }

    public String pizza1() {
        this.setTipo("Pizza");
        this.setSabor("Barra 8 pieces");
        this.setPreco(30.5);
        return
                "Pedido Confirmado.\nObrigado!\n\nSTATUS DO PEDIDO\n" +
                        "Tipo de comida: " + this.getTipo() + " \n" +
                        "Tipo de pizza: " + this.getSabor() + " \n" +
                        "Preco: R$" + this.getPreco();
    }

    public String pizza2() {
        this.setTipo("Pizza");
        this.setSabor("Barbas 10 Grand");
        this.setPreco(25.2);
        return
                "Pedido Confirmado.\nObrigado!\n\nSTATUS DO PEDIDO\n" +
                        "Tipo de comida: " + this.getTipo() + " \n" +
                        "Tipo de pizza: " + this.getSabor() + " \n" +
                        "Preco: R$" + this.getPreco();
    }

    public String pizza3() {
        this.setTipo("Pizza");
        this.setSabor("The Old Village's 16 Secrets");
        this.setPreco(45.99);
        return
                "Pedido Confirmado.\nObrigado!\n\nSTATUS DO PEDIDO\n" +
                        "Tipo de comida: " + this.getTipo() + " \n" +
                        "Tipo de pizza: " + this.getSabor() + " \n" +
                        "Preco: R$" + this.getPreco();
    }

    @Override
    public String entrega(boolean takeAway) {
        return super.entrega(takeAway);
    }

    @Override
    public String emitirIngredientes_1() {
        return
                "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" +
                        "\n+ Ficha de ingredientes padrão: carne de javali, massa crocante, queijo sensação, tomate e cebola +" +
                        "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
    }

    @Override
    public String emitirIngredientes_2() {
        return
                "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" +
                        "\n+ Ficha de ingredientes padrão: carne de bode desfiada, tripa crocante de bode, cogumelos neozelandeses cabreocráricos e hipinotizantes +" +
                        "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
    }

    @Override
    public String emitirIngredientes_3() {
        return
                "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" +
                        "\n+ Ficha de ingredientes padrão: queijo muçarela 1000 grau, alfafa, carne de carangueijo desfiada, triglicerídeos hipoglicemicos +" +
                        "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
    }
}
