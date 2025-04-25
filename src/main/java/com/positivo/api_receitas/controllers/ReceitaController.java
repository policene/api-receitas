package com.positivo.api_receitas.controllers;

import com.positivo.api_receitas.dto.IngredientesRequestDTO;
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
    public ResponseEntity<Receita> getById (@PathVariable Long id) {
        Optional<Receita> receita = service.getById(id);
        return receita.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/buscar-por-ingredientes")
    public ResponseEntity<List<Receita>> search(@RequestBody IngredientesRequestDTO request) {
        List<Receita> receitas = service.buscarPorIngredientes(request.ingredientes());
        return ResponseEntity.ok(receitas);
    }

}
