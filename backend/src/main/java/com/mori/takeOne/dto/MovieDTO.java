package com.mori.takeOne.dto;

import com.mori.takeOne.entities.Movie;

/**
 * Classe com os memos components do Movie, porém não está relacionado ao banco
 * de dados.
 * 
 * @author Adriel L. V. Mori, Igor Pádua e Bruna Espírito
 */

public class MovieDTO {
	
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;
	private String trailer;
	private String description;

	public MovieDTO() {
	}

	public MovieDTO(Long id, String title, Double score, Integer count, String image, String trailer, String description) {
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
		this.trailer = trailer;
		this.description = description;
	}
	
	public MovieDTO(Movie movie) {
		
		id = movie.getId();
		title = movie.getTitle();
		score = movie.getScore();
		count = movie.getCount();
		image = movie.getImage();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getTrailer() {
		return trailer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
