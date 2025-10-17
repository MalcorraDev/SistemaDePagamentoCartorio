package com.mycompany.projetopoo;

public class Certidao extends Servico {

    private String tipo;

    public Certidao(int id, String descricao, String tipo) {
        super(id, descricao, 55.51);
        this.tipo = tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String getDetalhes() {
        return "Certidão (" + tipo + ") - " + getDescricao() + " | Valor: R$" + getValor();
    }

    @Override
    public String toString() {
        return getDetalhes();
    }
}
