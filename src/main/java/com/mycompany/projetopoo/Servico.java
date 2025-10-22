package com.mycompany.projetopoo;


public class Servico { 

    public int id;
    public String descricao;
    public double valor;

    //CONSTRUTOR PARA CADASTRO 
    public Servico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    // CONSTRUTOR PARA BUSCA NO BANCO (com id) 
    public Servico(int id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

     /*GETTER AND SETTER*/
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

 
    public String getDetalhes() {
        return descricao + " | Valor: R$" + valor;
    }
    
    
}