package br.com.senai.model;

import java.util.ArrayList;

public class Endereco
{
    private String id_endereco;
    private String cep;
    private String numero_endereco;

    public Endereco( String id_endereco, String cep, String numero_endereco)
    {
        this.id_endereco = id_endereco;
        this.cep = cep;
        this.numero_endereco = numero_endereco;
    }

    public String getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(String id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero_endereco() {
        return numero_endereco;
    }

    public void setNumero_endereco(String numero_endereco) {
        this.numero_endereco = numero_endereco;
    }
}
