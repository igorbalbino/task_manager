package com.example.avaliacao.interfaces;

import com.example.avaliacao.models.Departamento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartamentoRepository extends MongoRepository<Departamento, String> {
}
