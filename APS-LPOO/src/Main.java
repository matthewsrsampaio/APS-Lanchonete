import java.util.Scanner;

public class Main {
    public static void apresentacao() {
        System.out.println("\n\n                      SEJA BEM-VINDO A LANCHONETE");
        System.out.println("                    VOCÊ ESTÁ NO MENU DE AUTO AJUDA");
    }
    public static String menuPrincipal() {
        String opcao;
        System.out.println("*********************************************************************");
        System.out.println("*                 DIGITE O NUMERO DA COMIDA ESCOLHIDA              *");
        System.out.println("*                 1-Hambuguer     2-Caldo     3-Pizza              *");
        System.out.println("*********************************************************************\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Resposta: ");
        opcao = scan.nextLine();
        return opcao;
    }

    public static String menuHamburguer() {
        String opcao;
        System.out.println("\n***************************************************************************************************************");
        System.out.println("*                                      DIGITE O NUMERO DO HAMBURGUER ESCOLHIDO                                *");
        System.out.println("*                  1-BigSkinnyBarra     2-JoanderBurger     3-ChunkyCommunistBurger   4-Desistir              *");
        System.out.println("*                      R$ 19.50             R$ 19.20               R$ 22.70                                   *");
        System.out.println("***************************************************************************************************************\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Resposta: ");
        opcao = scan.nextLine();
        return opcao;
    }

    public static String menuCaldo() {
        String opcao;
        System.out.println("\n****************************************************************************************************************");
        System.out.println("*                                          DIGITE O NUMERO DO CALDO ESCOLHIDO                                  *");
        System.out.println("*                 1-Best of Barra     2-M. Castelo's Super     3-Old Village's best   4-Desistir               *");
        System.out.println("*                      R$ 9.50               R$ 25.2                 R$ 10.00                                  *");
        System.out.println("****************************************************************************************************************\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Resposta: ");
        opcao = scan.nextLine();
        return opcao;
    }

    public static String menuPizza() {
        String opcao;
        System.out.println("\n*************************************************************************************************************************");
        System.out.println("*                                      DIGITE O NUMERO DA PIZZA ESCOLHIDA                                               *");
        System.out.println("*       1-Barra 8 Magic Pieces     2-Barba's 10 Grand Slices     3-The Old Village's 16 Secrets   4-Desistir            *");
        System.out.println("*              R$ 30.50                     R$ 25.20                         R$ 45.99                                   *");
        System.out.println("*************************************************************************************************************************\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Resposta: ");
        opcao = scan.nextLine();
        return opcao;
    }

    //Código principal
    public static void codigo() {
        Scanner scan = new Scanner(System.in);
        String opcao;
        apresentacao();
        do {
            switch (menuPrincipal()) {
                //Hamburguer
                case "1":
                    switch (menuHamburguer()) {
                        //BigSkinnyBarra
                        case "1" -> {
                            Comida burge = new Hamburguer();
                            System.out.println(burge.emitirIngredientes_1());
                            System.out.println("\nDeseja confirmar seu pedido? [ s - n ]");
                            System.out.print("Resposta: ");
                            opcao = scan.nextLine();
                            if (opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim")) {
                                System.out.println("\n" + burge.burger1_() + burge.extraInfo() +
                                        burge.emitirIngredientes_1() + burge.entrega(burge.isTakeAway()));
                            }
                        }
                        //Joander'sBurger
                        case "2" -> {
                            Comida burge2 = new Hamburguer();
                            System.out.println(burge2.emitirIngredientes_2());
                            System.out.println("\nDeseja confirmar seu pedido? [ s - n ]");
                            System.out.print("Resposta: ");
                            opcao = scan.nextLine();
                            if (opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim")) {
                                System.out.println("\n" + burge2.burger2_() + burge2.extraInfo() +
                                        burge2.emitirIngredientes_2() + burge2.entrega(burge2.isTakeAway()));
                            }
                        }
                        //ChunkyComunistBurger
                        case "3" -> {
                            Comida burge3 = new Hamburguer();
                            System.out.println(burge3.emitirIngredientes_3());
                            System.out.println("\nDeseja confirmar seu pedido? [ s - n ]");
                            System.out.print("Resposta: ");
                            opcao = scan.nextLine();
                            if (opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim")) {
                                System.out.println("\n" + burge3.burger3_() + burge3.extraInfo() +
                                        burge3.emitirIngredientes_3() + burge3.entrega(burge3.isTakeAway()));
                            }
                        }
                        //Sair do menu
                        case "4" -> System.out.println("Saindo do menu");
                        default -> System.out.println("Número inexistente!");
                    }
                    break;
                    //Caldo
                case "2":
                    switch (menuCaldo()) {
                        //Best of Barra
                        case "1" -> {
                            Comida caldo = new Caldo();
                            System.out.println(caldo.emitirIngredientes_1());
                            System.out.println("\nDeseja confirmar seu pedido? [ s - n ]");
                            System.out.print("Resposta: ");
                            opcao = scan.nextLine();
                            if (opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim")) {
                                System.out.println("\n" + caldo.caldo1_() + caldo.extraInfo() +
                                        caldo.emitirIngredientes_1() + caldo.entrega(caldo.isTakeAway()));
                            }
                        }
                        //M. Castelo's Super
                        case "2" -> {
                            Comida caldo2 = new Caldo();
                            System.out.println(caldo2.emitirIngredientes_2());
                            System.out.println("\nDeseja confirmar seu pedido? [ s - n ]");
                            System.out.print("Resposta: ");
                            opcao = scan.nextLine();
                            if (opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim")) {
                                System.out.println("\n" + caldo2.caldo2_() + caldo2.extraInfo() +
                                        caldo2.emitirIngredientes_2() + caldo2.entrega(caldo2.isTakeAway()));
                            }
                        }
                        //Old Village's Best
                        case "3" -> {
                            Comida caldo3 = new Caldo();
                            System.out.println(caldo3.emitirIngredientes_3());
                            System.out.println("\nDeseja confirmar seu pedido? [ s - n ]");
                            System.out.print("Resposta: ");
                            opcao = scan.nextLine();
                            if (opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim")) {
                                System.out.println("\n" + caldo3.caldo3_() + caldo3.extraInfo() +
                                        caldo3.emitirIngredientes_3() + caldo3.entrega(caldo3.isTakeAway()));
                            }
                        }
                        //Sair do menu
                        case "4" -> System.out.println("Saindo do menu");
                        default -> System.out.println("Número inexistente!");
                    }
                    break;
                    //Pizza
                case "3":
                    switch (menuPizza()) {
                        //Barra 8 Magic Pieces
                        case "1" -> {
                            Comida pizza = new Pizza();
                            System.out.println(pizza.emitirIngredientes_1());
                            System.out.println("\nDeseja confirmar seu pedido? [ s - n ]");
                            System.out.print("Resposta: ");
                            opcao = scan.nextLine();
                            if (opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim")) {
                                System.out.println("\n" + pizza.pizza1_() + pizza.extraInfo() +
                                        pizza.emitirIngredientes_1() + pizza.entrega(pizza.isTakeAway()));
                            }
                        }
                        //Barba's 10 Grand Slices
                        case "2" -> {
                            Comida pizza2 = new Pizza();
                            System.out.println(pizza2.emitirIngredientes_2());
                            System.out.println("\nDeseja confirmar seu pedido? [ s - n ]");
                            System.out.print("Resposta: ");
                            opcao = scan.nextLine();
                            if (opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim")) {
                                System.out.println("\n" + pizza2.pizza2_() + pizza2.extraInfo() +
                                        pizza2.emitirIngredientes_2() + pizza2.entrega(pizza2.isTakeAway()));
                            }
                        }
                        //The Old Village's 16 Secrets
                        case "3" -> {
                            Comida pizza3 = new Pizza();
                            System.out.println(pizza3.emitirIngredientes_3());
                            System.out.println("\nDeseja confirmar seu pedido? [ s - n ]");
                            System.out.print("Resposta: ");
                            opcao = scan.nextLine();
                            if (opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim")) {
                                System.out.println("\n" + pizza3.pizza3_() + pizza3.extraInfo() +
                                        pizza3.emitirIngredientes_3() + pizza3.entrega(pizza3.isTakeAway()));
                            }
                        }
                        //Sair do menu
                        case "4" -> System.out.println("Saindo do menu");
                        default -> System.out.println("Número inexistente!");
                    }
                    break;
                    //Caso o usuário digite um número errado ele acabará aqui
                default:
                    System.out.println("Número escolhido não existe!");
                    break;
            }
            //Pergunta para fim do LOOP, usando captura de "opcao"
            System.out.println("\nDeseja fazer outro pedido? [ s - n ]");
            System.out.print("Resposta: ");
            opcao = scan.nextLine();
            //While é usado para dar fim ao LOOP
        } while (opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim"));
    }

    //Em "main", o método código é chamado para o sistema inteiro funcionar.
    public static void main(String[] args) {
        codigo();
    }
}