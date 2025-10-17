package com.mycompany.projetopoo;

public class Transacao {

    private Cliente cliente;
    private Servico servico;
    private String data;
    private double valor;

    /*CONSTRUTOR*/
    public Transacao(Cliente cliente, Servico servico, String data) {
        this.cliente = cliente;
        this.servico = servico;
        this.data = data;
        this.valor = servico.getValor(); // pega direto do serviço
    }

    /*GETTER AND SETTER */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setservico(Servico servico) {
        this.servico = servico;
    }

    public Servico getservico() {
        return servico;
    }

    public void setdata(String data) {
        this.data = data;
    }

    public String getdata() {
        return data;
    }

    public void setvalor(double valor) {
        this.valor = valor;
    }

    public double getvalor() {
        return valor;
    }
    /*GETTER AND SETTER */

}
