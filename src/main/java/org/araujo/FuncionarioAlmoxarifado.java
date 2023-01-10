package org.araujo;

public class FuncionarioAlmoxarifado {

    public String requisitarItem(String item) {
        return ControladorLogistico.getInstancia().receberRequisicaoItem(item);
    }

    public String devolverItem(String item) {
        return ControladorLogistico.getInstancia().receberDevolucaoItem(item);
    }


}
