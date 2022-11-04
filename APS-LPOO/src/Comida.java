import java.util.Scanner;

//Classe Comida implementa a Interface "comum"
public abstract class Comida {
    private boolean takeAway = true;
    private double preco;
    private String comerFora;
    private String tipo;
    private String observacao;
    private String endereco;

    //Getters and Setters
    public String getEndereco() { return endereco; }

    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getObservacao() { return observacao; }

    public void setObservacao(String observacao) { this.observacao = observacao; }

    public boolean isTakeAway() { return takeAway; }

    public void setTakeAway(boolean takeAway) { this.takeAway = takeAway; }

    public double getPreco() { return preco; }

    public void setPreco(double preco) { this.preco = preco; }

    public String getComerFora() { return comerFora; }

    public void setComerFora(String comerFora) { this.comerFora = comerFora; }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }

    // Pratos da casa.
    //Instanciado aqui para que se possa usar os métodos de Comida com o objeto.
    public String burger1() { return null; }
    public String burger2() { return null; }
    public String burger3() { return null; }
    public String caldo1() { return null; }
    public String caldo2() { return null; }
    public String caldo3() { return null; }
    public String pizza1() { return null; }
    public String pizza2() { return null; }
    public String pizza3() { return null; }

    //extraInfo() coleta informações sobre o pedido como local do consumo,
    // endereço do cliente e observação sobre o pedido
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

    //takeAway é decidido no método extraInfo() e se "takeAway" for setado falso o pedido sai para entrega
    //caso contrário ele fica no local
    public String entrega(boolean takeAway) {
        if (!this.isTakeAway()) {
            return "\n\nPedido embalado para entrega, o Motoboy sai para a entrega em alguns minutos." +
                    "\nO endereço informado para entrega foi: "+ this.getEndereco();
        }
        return "\nO pedido será consumido no local.";
    }

    //Estes métodos de ingredientes são sobrescritos nas subclasses
    public String emitirIngredientes_1() {
        return null;
    }

    public String emitirIngredientes_2() {
        return null;
    }

    public String emitirIngredientes_3() {
        return null;
    }
}
