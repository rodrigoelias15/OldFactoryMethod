package test;

import main.java.com.company.IServico;
import main.java.com.company.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Serviço Indisponível");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("Informação não encontrada");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}