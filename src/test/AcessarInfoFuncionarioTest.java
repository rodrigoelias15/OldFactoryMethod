package test;

import main.java.com.company.IServico;
import main.java.com.company.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcessarInfoFuncionarioTest {
    @Test
    void deveAcessarInfoFuncionario() {
        IServico servico = ServicoFactory.obterServico("AcessarInfoFuncionario");
        assertEquals("Informações do Funcionário Acessadas", servico.executar());
    }

    @Test
    void deveCancelarInfoFuncionario() {
        IServico servico = ServicoFactory.obterServico("AcessarInfoFuncionario");
        assertEquals("Informações não acessadas", servico.cancelar());
    }
}