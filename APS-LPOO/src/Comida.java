import java.util.Scanner;

public class Comida implements comum{
    private boolean takeAway = true;
    private double preco;
    private String comerFora;
    private String tipo;
    private String observacao;
    private String endereco;
    private String tipoLanche;

    public String getEndereco() { return endereco; }

    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getObservacao() { return observacao; }

    public void setObservacao(String observacao) { this.observacao = observacao; }

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

    @Override
    public String extraInfo() {
        Scanner scan = new Scanner(System.in);
        String obs;
        System.out.println("Você gostaria de comer no local? [ s - n ]");
        System.out.print("Resposta: ");
        this.setComerFora(scan.nextLine());
        if (this.getComerFora().equalsIgnoreCase("n")) {
            this.setTakeAway(false);
            System.out.println("Por favor, informe o seu endereço.");
            System.out.print("Resposta: ");
            this.setEndereco(scan.nextLine());
        }
        System.out.println("Você gostaria de fazer alguma observação sobre o seu lanche? [ s - n ]");
        System.out.print("Resposta: ");
        obs = scan.nextLine();
        if (obs.equalsIgnoreCase("s") || (obs.equalsIgnoreCase("sim"))){
            System.out.println("Por favor, digite sua observação:");
            System.out.print("Resposta: ");
            this.setObservacao(scan.nextLine());
        } else {
            this.setObservacao("Pedido sem observações");
        }
        return "\nObservações: "+this.getObservacao();
    }

    @Override
    public String entrega(boolean takeAway) {
        if (!this.isTakeAway()) {
            return "\n\nPedido embalado para entrega, o Motoboy sai para a entrega em alguns minutos." +
                    "\nO endereço informado para entrega foi: "+ this.getEndereco();
        }
        return "\nO pedido será consumido no local.";
    }

    @Override
    public String emitirIngredientes_1() {
        return null;
    }

    @Override
    public String emitirIngredientes_2() {
        return null;
    }

    @Override
    public String emitirIngredientes_3() {
        return null;
    }
}
