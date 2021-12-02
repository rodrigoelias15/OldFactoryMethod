package com.company;

public class AdicionarProdutoEstoque implements IServico {
    public String executar() {
        return "Produto adicionado com sucesso!";
    }

    public String cancelar() {
        return "Produto não adicionado.";
    }
}
