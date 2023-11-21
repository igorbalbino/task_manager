package com.example.avaliacao.interfaces;

import com.example.avaliacao.models.Tarefa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TarefaRepository extends MongoRepository<Tarefa, String> {

}
