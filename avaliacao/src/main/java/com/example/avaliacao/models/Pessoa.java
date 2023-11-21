package com.example.avaliacao.models;

import lombok.Data;

@Data
public class Pessoa {
    private String nome;
    private String departamento;
    private String[] tarefas;

    public Pessoa(String nome, String departamento, String[] tarefas) {
        this.nome = nome;
        this.departamento = departamento;
        this.tarefas = tarefas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String[] getTarefas() {
        return tarefas;
    }

    public void setTarefas(String[] tarefas) {
        this.tarefas = tarefas;
    }
}
