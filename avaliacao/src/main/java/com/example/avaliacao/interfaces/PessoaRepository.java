package com.example.avaliacao.interfaces;

import com.example.avaliacao.models.Pessoa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PessoaRepository extends MongoRepository<Pessoa, String> {
}
