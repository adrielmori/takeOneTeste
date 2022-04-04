package com.mori.takeOne.dto;

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
