package br.com.carteira.main;
import br.com.carteira.model.DocumentoFactory;
import br.com.carteira.model.GerenciadorConfiguracao;
import br.com.carteira.model.IDocumento;


public class Main {

    public static void main(String[] args) {

        GerenciadorConfiguracao gen1 = GerenciadorConfiguracao.getInstance();

        System.out.println("API Key: " + gen1.getApiKey());

        GerenciadorConfiguracao gen2 = GerenciadorConfiguracao.getInstance();

        if (gen1 == gen2) {
            System.out.println("As duas instâncias apontam para o mesmo objeto!");
        }

        IDocumento documento = DocumentoFactory.criarDocumento("NF");

        documento.gerarPDF();

        try {
            IDocumento boleto = DocumentoFactory.criarDocumento("BOLETO");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar documento: " + e.getMessage());
        }
    }
}