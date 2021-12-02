package test;

import main.java.com.company.IServico;
import main.java.com.company.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcluiProdutoEstoqueTest {
    @Test
    void deveExcluirProdutoEstoque() {
        IServico servico = ServicoFactory.obterServico("ExcluirProdutoEstoque");
        assertEquals("Produto excluido com sucesso!", servico.executar());
    }

    @Test
    void deveCancelarExcluirProdutoEstoque() {
        IServico servico = ServicoFactory.obterServico("Formatura");
        assertEquals("Produto inexistente no estoque", servico.cancelar());
    }
}