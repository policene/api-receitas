package com.positivo.api_receitas.dto;

import java.util.List;

public record IngredientesRequestDTO(
        List<String> ingredientes
) {
}
