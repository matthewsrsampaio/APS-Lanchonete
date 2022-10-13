package Exercicio9;

public class Apartamento {
    private int codigo;
    private String logradouro;
    private String numero;
    private String complemento;
    private int CEP;
    private int qtdQuartos;
    private float valor;
    private int andar;

    // C o n s t r u t o r
//    Apartamento () {}

    Apartamento (String logradouro, String numero, String complemento, int cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.CEP = cep;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public int getQtdQuartos() {
        return qtdQuartos;
    }

    public void setQtdQuartos(int qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }



    // M é t o d o s

    public void definirEndereço(String logradouro, String numero, String complemento, int CEP) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.CEP = CEP;
    }

    public String consultarLogradouro() {
        return this.getLogradouro();
    }

    public String consultarNumero() {
        return this.getNumero();
    }

    public String consultarComplemento() {
        return this.getComplemento();
    }

    public int consultarCEP() {
        return this.getCEP();
    }

    public void definirQtdQuartos(int quantidade) {
        this.setQtdQuartos(quantidade);
    }

    public int consultarQtdQuartos() {
        return this.getQtdQuartos();
    }

    public void definirValor(float valor) {
        this.setValor(valor);
    }

    public float consultarValor() {
        return this.getValor();
    }

    public void definirAndar(int numeroAndar) {
        this.setAndar(numeroAndar);
    }

    public int consultarAndar() {
        return this.getAndar();
    }

}
