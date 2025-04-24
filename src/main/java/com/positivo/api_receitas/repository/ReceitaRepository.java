package com.positivo.api_receitas.repository;

import com.positivo.api_receitas.entities.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {

    @Query(value = "SELECT * FROM tb_receitas WHERE ingredientes <@ CAST(:ingredientes AS text[])", nativeQuery = true)
    List<Receita> findByIngredientes(@Param("ingredientes") String[] ingredientes);

}
