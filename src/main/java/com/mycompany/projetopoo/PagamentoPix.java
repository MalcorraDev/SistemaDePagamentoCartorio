package com.mycompany.projetopoo;

import java.time.LocalDate;

public class PagamentoPix {
    private String chavePix;
    private double valor;
    private LocalDate data;
    private String codigoPix; // simulação de código "copia e cola"

    public PagamentoPix(double valor) {
        this.valor = valor;
        this.data = LocalDate.now();
        this.chavePix = "cartorio@pix.com";
        this.codigoPix = gerarCodigoPix();
    }

    private String gerarCodigoPix() {
        return "PIX-" + System.currentTimeMillis();
    }

    public String getChavePix() { return chavePix; }
    public double getValor() { return valor; }
    public LocalDate getData() { return data; }
    public String getCodigoPix() { return codigoPix; }
}
