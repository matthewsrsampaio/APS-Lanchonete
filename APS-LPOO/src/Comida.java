public class Comida {
    private String tamanhoPorcao;
    private boolean takeAway;
    private double preco;
    private String comerFora;

    private String tipo;

    public String getTamanhoPorcao() {
        return tamanhoPorcao;
    }

    public void setTamanhoPorcao(String tamanhoPorcao) {
        this.tamanhoPorcao = tamanhoPorcao;
    }

    public boolean isTakeAway() { return takeAway; }

    public void setTakeAway(boolean takeAway) {
        this.takeAway = takeAway;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getComerFora() {
        return comerFora;
    }

    public void setComerFora(String comerFora) {
        this.comerFora = comerFora;
    }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }

    public void pedido(double preco, boolean takeaway, String porcao, String sabor, String tipo) {
        this.setPreco(preco);
        this.setTamanhoPorcao(porcao);
        this.setTakeAway(takeaway);
        this.setComerFora(this.isTakeAway() ? "SIM" : "NÃO");
        this.setTipo(tipo);
    }

    // Pratos da casa.
    public String burger1_() {
        Hamburguer burge1 = new Hamburguer();
        return burge1.burger1();
    }
    public String burger2_() {
        Hamburguer burge2 = new Hamburguer();
        return burge2.burger2();
    }
    public String burger3_() {
        Hamburguer burge3 = new Hamburguer();
        return burge3.burger3();
    }

    public String caldo1_() {
        Caldo caldo1 = new Caldo();
        return caldo1.caldo1();
    }
    public String caldo2_() {
        Caldo caldo2 = new Caldo();
        return caldo2.caldo2();
    }
    public String caldo3_() {
        Caldo caldo3 = new Caldo();
        return caldo3.caldo3();
    }

    public String pizza1_() {
        Pizza pizza1 = new Pizza();
        return pizza1.pizza1();
    }
    public String pizza2_() {
        Pizza pizza2 = new Pizza();
        return pizza2.pizza2();
    }
    public String pizza3_() {
        Pizza pizza3 = new Pizza();
        return pizza3.pizza3();
    }

    public String emitirIngredientes() {
        return
                "\nSem informações";
    }

    public String emitirIngredientes_1() {
        return
                "\nSem informações sobre o burguer 1";
    }

    public String emitirIngredientes_2() {
        return
                "\nSem informações sobre o burguer 2";
    }

    public String emitirIngredientes_3() {
        return
                "\nSem informações sobre o burguer 1";
    }


}
