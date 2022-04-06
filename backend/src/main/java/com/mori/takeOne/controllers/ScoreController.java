package com.mori.takeOne.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mori.takeOne.dto.MovieDTO;
import com.mori.takeOne.dto.ScoreDTO;
import com.mori.takeOne.entities.Movie;
import com.mori.takeOne.entities.ScorePK;
import com.mori.takeOne.entities.User;
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
	
	@RequestMapping(value = "/{movie_id}/{user_id}", method = RequestMethod.GET)
	public ScoreDTO ScoreById(@PathVariable Movie movie_id, @PathVariable User user_id) {
		ScorePK id = new ScorePK(movie_id, user_id);
		return service.getScore(id);
	} 
}
