package com.mycompany.projetopoo;

public class CancelamentoProtesto extends Servico {

    public CancelamentoProtesto(int id, String descricao, double valor, String obs) {
        super(id, descricao, valor);
    }

    @Override
    public String getDetalhes() {
        return "Cancelamento de Protesto - " + getDescricao() + " | Valor: R$" + getValor();
    }

    @Override
    public String toString() {
        return getDetalhes();
    }
}
