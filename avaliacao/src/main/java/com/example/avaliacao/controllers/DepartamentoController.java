package com.example.avaliacao.controllers;

import com.example.avaliacao.interfaces.DepartamentoRepository;
import com.example.avaliacao.models.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartamentoController {
    @Autowired
    private DepartamentoRepository repository;

    @GetMapping("/departamento/listar")
    public List<Departamento> list() {
        return repository.findAll();
    };

}
