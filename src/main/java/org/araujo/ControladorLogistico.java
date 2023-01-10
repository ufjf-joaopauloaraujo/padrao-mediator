package org.araujo;

public class ControladorLogistico {

    private static ControladorLogistico instancia = new ControladorLogistico();

    private ControladorLogistico() {}

    public static ControladorLogistico getInstancia() {
        return instancia;
    }

    public String receberRequisicaoItem(String item) {
        return "Controlador logístico acionado.\n"+
                "O depósito respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Deposito.getInstancia().receberRequisicao(item);
    }

    public String receberDevolucaoItem(String item) {
        return "Controlador logístico acionado.\n"+
                "O depósito respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Deposito.getInstancia().receberDevolucao(item);
    }

}
