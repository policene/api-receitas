package com.positivo.api_receitas.entities;

import java.util.List;

public class Receita {

    Integer id;
    String nome;
    String descricao;
    List<String> ingredientes;

    public Receita(Integer id, String nome, String descricao, List<String> ingredientes) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.ingredientes = ingredientes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
