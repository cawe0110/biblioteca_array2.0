package br.com.senai.model;

public class Autor extends Pessoa
{
    private String id_autor;

    public Autor(String id_autor, String nome_pessoa, Endereco endereco_pessoa) {
        super(nome_pessoa, endereco_pessoa);
        this.id_autor = id_autor;
    }

    public String getId_autor() {
        return id_autor;
    }

    public void setId_autor(String id_autor) {
        this.id_autor = id_autor;
    }
}
