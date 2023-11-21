package com.example.avaliacao.controllers;

import com.example.avaliacao.interfaces.PessoaRepository;
import com.example.avaliacao.models.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PessoaController {
    @Autowired
    private PessoaRepository repository;

    @PostMapping("/pessoas")
    public String pessoas(@RequestParam(value = "nome", defaultValue = "World") String nome,
                          @RequestParam(value = "departamento", defaultValue = "Financeiro") String departamento,
                          @RequestParam(value = "tarefas", defaultValue = "Testar") String[] tarefas) {
        Pessoa pessoa = new Pessoa(nome, departamento, tarefas);
        repository.save(pessoa);
        return "Salvo!";
    }

    @PutMapping("/pessoa")
    public String pessoa(@RequestParam(value = "id", defaultValue = "0") String id,
                          @RequestParam(value = "departamento", defaultValue = "Financeiro") String departamento,
                          @RequestParam(value = "tarefas", defaultValue = "Testar") String[] tarefas) {
        Optional<Pessoa> opPessoa  = repository.findById(id);

        Pessoa pessoa = opPessoa.get();
        pessoa.setDepartamento(departamento);
        pessoa.setTarefas(tarefas);

        repository.save(pessoa);
        return "Salvo!";
    }

    @DeleteMapping("/pessoa")
    public String deletaPessoa(@RequestParam(value = "id", defaultValue = "0") String id) {
        Optional<Pessoa> opPessoa  = repository.findById(id);

        Pessoa pessoa = opPessoa.get();

        repository.delete(pessoa);
        return "Salvo!";
    }
}
