package com.company;

public class ExcluiProdutoEstoque implements IServico {
    public String executar() {
        return "Produto excluido com sucesso!";
    }

    public String cancelar() {
        return "Produto inexistente no estoque";
    }
}
