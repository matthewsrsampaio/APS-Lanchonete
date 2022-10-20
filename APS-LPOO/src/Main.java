import java.util.Scanner;

public class Main {
    public static String menuPrincipal() {
        String opcao;
        System.out.println("\n*******************************************************************************");
        System.out.println("*                DIGITE O NUMERO DA COMIDA ESCOLHIDA                          *");
        System.out.println("*                1-Hambuguer     2-Caldo     3-Pizza                          *");
        System.out.println("*******************************************************************************\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Resposta: ");
        opcao = scan.nextLine();
        return opcao;
    }

    public static String menuHamburguer() {
        String opcao;
        System.out.println("\n*******************************************************************************");
        System.out.println("*               DIGITE O NUMERO DO HAMBURGUER ESCOLHIDO                       *");
        System.out.println("*     1-BigSkinnyBarra     2-JoanderBurger     3-ChunkyCommunistBurger        *");
        System.out.println("*******************************************************************************\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Resposta: ");
        opcao = scan.nextLine();
        return opcao;
    }

    public static String menuCaldo() {
        String opcao;
        System.out.println("\n*******************************************************************************");
        System.out.println("*                    DIGITE O NUMERO DO CALDO ESCOLHIDO                       *");
        System.out.println("*     1-Best of Barra     2-M. Castelo's Super     3-Old Village's best       *");
        System.out.println("*******************************************************************************\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Resposta: ");
        opcao = scan.nextLine();
        return opcao;
    }

    public static String menuPizza() {
        String opcao;
        System.out.println("\n*******************************************************************************");
        System.out.println("*                    DIGITE O NUMERO DA PIZZA ESCOLHIDA                        *");
        System.out.println("*   1-Barra 8 pieces     2-Barbas 10 Grand     3-The Old Village's 16 Secrets  *");
        System.out.println("*******************************************************************************\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Resposta: ");
        opcao = scan.nextLine();
        return opcao;
    }

    public static void codigo() {
        switch (menuPrincipal()) {
            //Hamburguer
            case "1":
                switch (menuHamburguer()) {
                    case "1":
                        Comida burge = new Hamburguer();
                        System.out.println("\n"+burge.burger1_()+burge.emitirIngredientes_1());
                        break;
                    case "2":
                        Comida burge2 = new Hamburguer();
                        System.out.println("\n"+burge2.burger2_()+burge2.emitirIngredientes_2());
                        break;
                    case "3":
                        Comida burge3 = new Hamburguer();
                        System.out.println("\n"+burge3.burger3_()+burge3.emitirIngredientes_3());
                        break;
                }
                break;
            case "2":
                switch (menuCaldo()) {
                    case "1":
                        Comida caldo = new Caldo();
                        System.out.println("\n"+caldo.caldo1_()+caldo.emitirIngredientes_1());
                        break;
                    case "2":
                        Comida caldo2 = new Caldo();
                        System.out.println("\n"+caldo2.caldo2_()+caldo2.emitirIngredientes_2());
                        break;
                    case "3":
                        Comida caldo3 = new Caldo();
                        System.out.println("\n"+caldo3.caldo3_()+caldo3.emitirIngredientes_3());
                        break;
                }
                break;
            case "3":
                switch (menuPizza()) {
                    case "1":
                        Comida pizza = new Pizza();
                        System.out.println("\n"+pizza.pizza1_()+pizza.emitirIngredientes_1());
                        break;
                    case "2":
                        Comida pizza2 = new Pizza();
                        System.out.println("\n"+pizza2.pizza2_()+pizza2.emitirIngredientes_2());
                        break;
                    case "3":
                        Comida pizza3 = new Pizza();
                        System.out.println("\n"+pizza3.pizza3_()+pizza3.emitirIngredientes_3());
                        break;
                }
                break;
        }
    }

    public static void main(String[] args) {
        codigo();
    }
}