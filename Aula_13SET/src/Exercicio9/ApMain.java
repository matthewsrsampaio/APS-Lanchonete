package Exercicio9;

public class ApMain {
    public static void main(String[] args) {
        Apartamento apartamento = new Apartamento("Rua Cecil Salgado", "852", "N/A", 60346005);
        System.out.println(apartamento.getLogradouro());
        System.out.println(apartamento.getNumero());
        System.out.println(apartamento.getComplemento());
        System.out.println(apartamento.getCEP());
        apartamento.setQtdQuartos(43);
        apartamento.setValor(52323);
        System.out.println(apartamento.getQtdQuartos());
        System.out.println(apartamento.getValor());
    }
}

