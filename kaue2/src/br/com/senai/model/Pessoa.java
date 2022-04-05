package br.com.senai.model;

public class Pessoa
{
private String nome_pessoa;
private Endereco endereco_pessoa;

    public Pessoa (String nome_pessoa, Endereco endereco_pessoa)
    {
        this.nome_pessoa = nome_pessoa;
        this.endereco_pessoa = endereco_pessoa;
    }

    public String getNome_pessoa() {
        return nome_pessoa;
    }

    public void setNome_pessoa(String nome_pessoa) {
        this.nome_pessoa = nome_pessoa;
    }

    public Endereco getEndereco_pessoa() {
        return endereco_pessoa;
    }

    public void setEndereco_pessoa(Endereco endereco_pessoa) {
        this.endereco_pessoa = endereco_pessoa;
    }
}