package com.company;

public class AdicionarProdutoEstoque implements IServico {
    public String executar() {
        return "Trancamento efetivado";
    }

    public String cancelar() {
        return "Trancamento cancelado";
    }
}
