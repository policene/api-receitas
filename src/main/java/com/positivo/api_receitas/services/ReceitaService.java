package com.positivo.api_receitas.services;

import com.positivo.api_receitas.entities.Receita;
import com.positivo.api_receitas.repository.ReceitaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService {

    private final ReceitaRepository repository;

    public ReceitaService(ReceitaRepository repository) {
        this.repository = repository;
    }

    public List<Receita> getAll(){
        return repository.getAll();
    }

    public Receita getById (int id) {
        return repository.getById(id);
    }

}
