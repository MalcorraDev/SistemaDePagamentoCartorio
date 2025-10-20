package com.mycompany.projetopoo;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private int id_cliente;

    /*CONSTRUTOR*/
    public Cliente(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public Cliente(int id_cliente, String nome, String cpf, String telefone, String email) { //banco 
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    /*GETTER AND SETTER */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setIdCliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getIdCliente() {
        return id_cliente;
    }

    /*GETTER AND SETTER */
    @Override
    public String toString() {
        return nome;
    }

}
