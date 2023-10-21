package br.edu.ifgoiano.barbearia.modelo.dto;

import java.util.Date;

public class Cliente {

    private int id;
    private String nome;
    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome, String tel) {
        this.nome = nome;
        this.telefone = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome;
    }
}
