package org.araujo;

public class Deposito implements Setor {

    private static Deposito instancia = new Deposito();

    private Deposito() {}

    public static Deposito getInstancia() {
        return instancia;
    }

    public String receberDevolucao(String item) {
        return "O depósito enviará o item solicitado: " + item;
    }

    public String receberRequisicao(String item) {
        return "O depósito receberá o item a ser enviado: " + item;
    }
}
