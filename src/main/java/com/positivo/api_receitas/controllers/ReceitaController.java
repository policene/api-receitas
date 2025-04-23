package com.positivo.api_receitas.controllers;

import com.positivo.api_receitas.entities.Receita;
import com.positivo.api_receitas.services.ReceitaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/receitas")
public class ReceitaController {

    private final ReceitaService service;


    public ReceitaController(ReceitaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Receita>> getAll () {
     List<Receita> receitas = service.getAll();
     return ResponseEntity.ok(receitas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Receita> getById (@PathVariable int id) {
        Receita receita = service.getById(id);
        return ResponseEntity.ok(receita);
    }

}
