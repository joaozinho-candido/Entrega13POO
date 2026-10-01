package br.com.carteira.model;

public class DocumentoFactory {
    public static IDocumento criarDocumento(String tipo) {
        if (tipo.equals("NF"))
            return new NotaFiscal();
        else if (tipo.equals("RECIBO"))
            return new Recibo();
        else
            throw new IllegalArgumentException("esse tipo de documento nao eh valido");
    }
}
