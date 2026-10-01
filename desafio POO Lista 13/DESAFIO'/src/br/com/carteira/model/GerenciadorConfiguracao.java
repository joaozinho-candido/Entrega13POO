package br.com.carteira.model;

public class GerenciadorConfiguracao {
    private String apiKey = "AWS-12345-KEY";

    private GerenciadorConfiguracao() {

    }

    private static GerenciadorConfiguracao instancia;

    public static GerenciadorConfiguracao getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorConfiguracao();
        }
        return instancia;
    }

    public String getApiKey() {
        return apiKey;
    }

}
