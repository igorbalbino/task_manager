package com.example.avaliacao.models;

import lombok.Data;

@Data
public class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private String departamento;
    private String duracao;
    private String pessoaAlocada;
    private String finalizado;

    public Tarefa(String titulo, String descricao, String prazo, String departamento, String duracao, String pessoaAlocada, String finalizado) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.departamento = departamento;
        this.duracao = duracao;
        this.pessoaAlocada = pessoaAlocada;
        this.finalizado = finalizado;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getPessoaAlocada() {
        return pessoaAlocada;
    }

    public void setPessoaAlocada(String pessoaAlocada) {
        this.pessoaAlocada = pessoaAlocada;
    }

    public String isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(String finalizado) {
        this.finalizado = finalizado;
    }
}
