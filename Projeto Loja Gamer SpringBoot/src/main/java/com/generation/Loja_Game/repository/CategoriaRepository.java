package com.generation.Loja_Game.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.Loja_Game.model.Categoria;


public interface CategoriaRepository extends JpaRepository <Categoria, Long> {

public List <Categoria>  findAllByTemaContainingIgnoreCase(@Param ("tema") String tema);
	

	
}