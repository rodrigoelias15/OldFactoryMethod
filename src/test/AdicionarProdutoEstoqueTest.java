package test;

import main.java.com.company.IServico;
import main.java.com.company.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdicionarProdutoEstoqueTest {
    @Test
    void deveAdicionarProdutoEstoque() {
        IServico servico = ServicoFactory.obterServico("AdicionarProdutoEstoque");
        assertEquals("Produto adicionado com sucesso!", servico.executar());
    }

    @Test
    void deveCancelarProdutoEstoque() {
        IServico servico = ServicoFactory.obterServico("Cancelar");
        assertEquals("Produto não adicionado", servico.cancelar());
    }

}