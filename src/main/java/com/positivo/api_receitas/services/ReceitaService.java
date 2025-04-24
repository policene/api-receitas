package com.positivo.api_receitas.services;

import com.positivo.api_receitas.dto.IngredientesRequestDTO;
import com.positivo.api_receitas.entities.Receita;
import com.positivo.api_receitas.repository.ReceitaRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReceitaService {

    private final ReceitaRepository repository;

    public ReceitaService(ReceitaRepository repository) {
        this.repository = repository;
    }

    @Cacheable(value = "receitas_todas")
    public List<Receita> getAll(){
        return repository.findAll();
    }

    @Cacheable(value = "receitas_por_id", key = "#id")
    public Optional<Receita> getById (Long id) {
        return repository.findById(id);
    }

    @Cacheable(value = "receitas_por_ingredientes", key = "#ingredientes")
    public List<Receita> buscarPorIngredientes(List<String> ingredientes) {
        // Tem que transformar a List em um array porque o JPA não consegue
        // fazer a conversão de List para text[] no PostgreSQL.
        String[] ingredientesArray = ingredientes.toArray(new String[0]);
        return repository.findByIngredientes(ingredientesArray);
    }

}
