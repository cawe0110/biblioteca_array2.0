package br.com.senai.model;

import java.util.ArrayList;

public class Livro {
    private String id_livro;
    private String autor;
    private String nome;

    public Livro(String id_livro, String autor, String nome){
        this.id_livro = id_livro;
        this.autor = autor;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId_livro() {
        return id_livro;
    }

    public void setId_livro(String id_livro) {
        this.id_livro = id_livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
