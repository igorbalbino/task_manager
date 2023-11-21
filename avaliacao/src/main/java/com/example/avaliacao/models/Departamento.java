package com.example.avaliacao.models;

import lombok.Data;

@Data
public class Departamento {
    private String title;

    public Departamento(String title) {
        this.title = title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}
