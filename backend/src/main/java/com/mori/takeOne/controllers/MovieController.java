package com.mori.takeOne.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mori.takeOne.dto.MovieDTO;
import com.mori.takeOne.services.MovieService;

/**
 * Classe que implemetna o EndPoint; Endereço do navegador que responde uma
 * página de filme
 * 
 * @author Adriel L. V. Mori, Igor Pádua e Bruna Espírito
 */

@RestController
@RequestMapping(value = "/movies") // Mapeia o caminho que irá respodner
public class MovieController {

	@Autowired
	private MovieService service;

	// Para retornar um único filme por Id
	@GetMapping(value = "/{id}")
	public MovieDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@GetMapping
	public Page<MovieDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}
}
