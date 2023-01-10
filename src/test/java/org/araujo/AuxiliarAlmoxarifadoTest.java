package org.araujo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuxiliarAlmoxarifadoTest {

    @Test
    void deveRequisitarItem() {
        AuxiliarAlmoxarifado auxiliar = new AuxiliarAlmoxarifado();
        assertEquals("Controlador logístico acionado.\n" +
                        "O depósito respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O depósito receberá o item a ser enviado: 10 Bobinas",
                auxiliar.requisitarItem("10 Bobinas"));
    }

    @Test
    void deveDevolverItem() {
        AuxiliarAlmoxarifado auxiliar = new AuxiliarAlmoxarifado();
        assertEquals("Controlador logístico acionado.\n" +
                        "O depósito respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O depósito enviará o item solicitado: 4 paletes de folha",
                auxiliar.devolverItem("4 paletes de folha"));
    }

}