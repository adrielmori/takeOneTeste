package com.mori.takeOne.dto;

import com.mori.takeOne.entities.Movie;
import com.mori.takeOne.entities.Score;
import com.mori.takeOne.entities.ScorePK;
import com.mori.takeOne.entities.User;

/**
 * Classe de entrada do usuário para a avaliçao do filme.
 * 
 * @author Adriel L. V. Mori, Igor Pádua e Bruna Espírito
 */

public class ScoreDTO {

	private Long movieId;
	private String email;
	private Double score;
	private String comment;

	
	public ScoreDTO() {
		
	}
	
	public ScoreDTO(ScorePK id, Long movieId, String email, Double score, String comment) {
		this.movieId = movieId;
		this.email = email;
		this.score = score;
		this.comment = comment;
	}
	
	public ScoreDTO(Score result, Movie id, User use) {
		movieId = id.getId();
		email = use.getEmail();
		comment = result.getComment();
		score = result.getValue();
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}	

}
