public class Main {
    public static void main(String[] args) {
        Hamburguer burge = new Hamburguer();
        burge.pedido(15.5,"GG", true, "mal", "BarraBigSkinny");

        Caldo caldo = new Caldo();
        caldo.pedido(5.3, false, "M", "Peixe");

        Pizza pizza = new Pizza();
        pizza.pedido(30.25, true, "G", "Pepperoni");


        System.out.println(burge);
        System.out.println("\n" + caldo);
        System.out.println("\n" + pizza);

    }
}