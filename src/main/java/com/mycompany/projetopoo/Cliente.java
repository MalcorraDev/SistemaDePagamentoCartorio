package com.mycompany.projetopoo;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    /*CONSTRUTOR*/
    public Cliente(String nome, String cpf, String telefone, String email) {
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

    /*GETTER AND SETTER */

    @Override
    public String toString() {
        return nome;
    }

}
