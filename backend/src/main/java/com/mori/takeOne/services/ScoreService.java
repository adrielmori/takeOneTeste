package com.mori.takeOne.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mori.takeOne.dto.MovieDTO;
import com.mori.takeOne.dto.ScoreDTO;
import com.mori.takeOne.entities.Movie;
import com.mori.takeOne.entities.Score;
import com.mori.takeOne.entities.User;
import com.mori.takeOne.repositories.MovieRepository;
import com.mori.takeOne.repositories.ScoreRepository;
import com.mori.takeOne.repositories.UserRepository;

@Service // Registro de componente
public class ScoreService {

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ScoreRepository scoreRepository;

	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {// Lógica para salver o score no banco de dados

		User user = userRepository.findByEmail(dto.getEmail());

		if (user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepository.save(user);// salvando no banco de dadso um novo usuário
			user = userRepository.saveAndFlush(user);// Método saveAndFlush garantir que tenha o objeto atualizado
		}

		Movie movie = movieRepository.findById(dto.getMovieId()).get();

		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		score.setComment(dto.getComment());

		score = scoreRepository.saveAndFlush(score);// salvando no banco de dados o score

		double sum = 0.0;
		for (Score s : movie.getScores()) {// lista de score associada ao filme
			sum = sum + s.getValue();// soma de todas as notas
		}

		double avg = sum / movie.getScores().size();

		movie.setScore(avg);
		movie.setCount(movie.getScores().size());

		movie = movieRepository.save(movie);

		return new MovieDTO(movie);
	}
}
