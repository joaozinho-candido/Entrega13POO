package br.com.carteira.model;

public class Recibo implements IDocumento {
    public void gerarPDF() {
        System.out.println("Gerando recibo simples de pagamento....");
    }
}
