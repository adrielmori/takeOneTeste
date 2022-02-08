package com.mori.takeOne.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mori.takeOne.dto.MovieDTO;
import com.mori.takeOne.dto.ScoreDTO;
import com.mori.takeOne.services.ScoreService;

/**
 * Classe que implemetna o EndPoint; Tratamento de casos para as entradas dos
 * usuários
 * 
 * @author Adriel L. V. Mori, Igor Pádua e Bruna Espírito
 */

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

	@Autowired
	private ScoreService service;

	@PutMapping
	public MovieDTO SaveScore(@RequestBody ScoreDTO dto) { // corpo da requisição
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
	}
}
