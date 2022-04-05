package br.com.senai.model;

public class Biblioteca {
    private String nome_bibli;
    private String id_bibli;
    private Livro livros;
    private Endereco endereco_bibli;

    public Biblioteca (String nome_bibli, String id_bibli,Livro livros, Endereco endereco_bibli) {
        this.nome_bibli = nome_bibli;
        this.id_bibli = id_bibli;
        this.livros = livros;
        this.endereco_bibli = endereco_bibli;
    }

    public String getNome_bibli() {
        return nome_bibli;
    }

    public void setNome_bibli(String nome_bibli) {
        this.nome_bibli = nome_bibli;
    }

    public Livro getLivros() {
        return livros;
    }

    public void setLivros(Livro livros) {
        this.livros = livros;
    }

    public String getId_bibli() {
        return id_bibli;
    }

    public void setId_bibli(String id_bibli) {
        this.id_bibli = id_bibli;
    }

    public Endereco getEndereco_bibli() {
        return endereco_bibli;
    }

    public void setEndereco_bibli(Endereco endereco_bibli) {
        this.endereco_bibli = endereco_bibli;
    }
}