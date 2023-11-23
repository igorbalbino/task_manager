package com.example.avaliacao.controllers;

import com.example.avaliacao.interfaces.TarefaRepository;
import com.example.avaliacao.models.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TarefaController {
    @Autowired
    private TarefaRepository repository;

    @PostMapping("/tarefas")
    public String add(@RequestParam(value = "titulo", defaultValue = "World") String titulo,
                          @RequestParam(value = "descricao", defaultValue = "Descricao da tarefa") String descricao,
                          @RequestParam(value = "prazo", defaultValue = "10 dias") String prazo,
                          @RequestParam(value = "departamento", defaultValue = "Financeiro") String departamento,
                          @RequestParam(value = "duracao", defaultValue = "10 dias") String duracao,
                          @RequestParam(value = "pessoaAlocada", defaultValue = "0") String pessoaAlocada,
                          @RequestParam(value = "finalizado", defaultValue = "false") String finalizado) {

        Tarefa tarefa = new Tarefa(titulo, descricao, prazo, departamento, duracao, pessoaAlocada, finalizado);
        repository.save(tarefa);

        return "Salvo!";
    }

    @PutMapping("/tarefas/alocar")
    public String alicar(@RequestParam(value = "idPessoa", defaultValue = "0") String idPessoa,
                          @RequestParam(value = "idTarefa", defaultValue = "0") String idTarefa) {

        Optional<Tarefa> opTarefa = repository.findById(idTarefa);

        Tarefa tarefa = opTarefa.get();
        tarefa.setPessoaAlocada(idPessoa);

        repository.save(tarefa);

        return "Salvo!";
    }

    @PutMapping("/tarefas/finalizar")
    public String finalizar(@RequestParam(value = "idTarefa", defaultValue = "0") String idTarefa,
                                @RequestParam(value = "duracao", defaultValue = "0") String duracao) {

        Optional<Tarefa> opTarefa = repository.findById(idTarefa);

        Tarefa tarefa = opTarefa.get();
        tarefa.setFinalizado("true");
        tarefa.setDuracao(duracao);

        repository.save(tarefa);

        return "Salvo!";
    }

    @GetMapping("/tarefas/listar")
    public List<Tarefa> list() {
        return repository.findAll();
    }
}
