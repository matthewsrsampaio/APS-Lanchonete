public class Pizza extends Comida implements comum{
    private String sabor;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) { this.sabor = sabor; }

    public String pizza1() {
        this.setTipo("Pizza");
        this.setSabor("Barra 8 Magic Pieces");
        this.setPreco(30.5);
        return
                "\nPedido Confirmado.\nObrigado!\n\nSTATUS DO PEDIDO\n" +
                "\nTipo de comida: " + this.getTipo() +
                "\nTipo de pizza: " + this.getSabor() +
                "\nPreco: R$" + this.getPreco();
    }

    public String pizza2() {
        this.setTipo("Pizza");
        this.setSabor("Barba's 10 Grand Slices");
        this.setPreco(25.2);
        return
                "\nPedido Confirmado.\nObrigado!\n\nSTATUS DO PEDIDO\n" +
                "\nTipo de comida: " + this.getTipo() +
                "\nTipo de pizza: " + this.getSabor() +
                "\nPreco: R$" + this.getPreco();
    }

    public String pizza3() {
        this.setTipo("Pizza");
        this.setSabor("The Old Village's 16 Secrets");
        this.setPreco(45.99);
        return
                "\nPedido Confirmado.\nObrigado!\n\nSTATUS DO PEDIDO\n" +
                "\nTipo de comida: " + this.getTipo() +
                "\nTipo de pizza: " + this.getSabor() +
                "\nPreco: R$" + this.getPreco();
    }

    @Override
    public String entrega(boolean takeAway) {
        return super.entrega(takeAway);
    }

    @Override
    public String emitirIngredientes_1() {
        return "\nFicha de ingredientes padrão: carne de javali, massa crocante, queijo sensação, tomate e cebola";
    }

    @Override
    public String emitirIngredientes_2() {
        return "\nFicha de ingredientes padrão: carne de bode desfiada, tripa crocante de bode, cogumelos neozelandeses cabreocráricos e hipinotizantes";
    }

    @Override
    public String emitirIngredientes_3() {
        return "\nFicha de ingredientes padrão: queijo muçarela 1000 grau, alfafa, carne de carangueijo desfiada, triglicerídeos hipoglicemicos";
    }
}
