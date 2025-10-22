package com.mycompany.projetopoo;

public class Transacao {

    private int id_transacao;
    private int id_cliente;
    private int id_servico;
    private String data;
    private double valor;

    public Transacao(int id_cliente, int id_servico, String data, double valor) {
        this.id_cliente = id_cliente;
        this.id_servico = id_servico;
        this.data = data;
        this.valor = valor;
        
        
    }

    /*CONSTRUTOR para buscar (SELECT) */
    // Recebe o ID gerado pelo banco
    public Transacao(int id_transacao, int id_cliente, int id_servico, String data, double valor) {
        this.id_transacao = id_transacao;
        this.id_cliente = id_cliente;
        this.id_servico = id_servico;
        this.data = data;
        this.valor = valor;
    }

    // Adicione/Ajuste Getters para os IDs
    public int getId_cliente() {
        return id_cliente;
    }

    public int getId_servico() {
        return id_servico;
    }

    public int getId_transacao() {
        return id_transacao;
    }

    // Mantenha os demais getters (data, valor)
    public String getdata() {
        return data;
    }

    public double getvalor() {
        return valor;
    }


}
