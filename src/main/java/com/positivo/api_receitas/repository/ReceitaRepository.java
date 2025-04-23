package com.positivo.api_receitas.repository;

import com.positivo.api_receitas.entities.Receita;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ReceitaRepository {

    private List<Receita> receitas = new ArrayList<>();

    public ReceitaRepository() {




    }

    public List<Receita> getAll () {
        return receitas;
    }

    public Receita getById (int id) {
        return receitas.stream().filter(receita -> receita.getId() == id).findFirst().orElse(null);
    }

}
