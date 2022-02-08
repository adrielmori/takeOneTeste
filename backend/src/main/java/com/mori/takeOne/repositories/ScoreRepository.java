package com.mori.takeOne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mori.takeOne.entities.Score;
import com.mori.takeOne.entities.ScorePK;

/**
 * Classe implementada para manipulas a opções de acerca dos filmes localizados
 * no banco de dados
 * 
 * @author Adriel L. V. Mori, Igor Pádua e Bruna Espírito
 */

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {// tipo da entidade, tipo do Id da entidade

	
}
