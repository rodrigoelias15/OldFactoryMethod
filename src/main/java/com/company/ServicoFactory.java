package main.java.com.company;

public class ServicoFactory {

    public static IServico obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("com.company.Servico" + servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IServico) objeto;
    }
}
