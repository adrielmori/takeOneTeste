package com.mori.takeOne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mori.takeOne.entities.User;

/**
 * Classe implementada para manipulas a opções de acerca dos filmes localizados
 * no banco de dados
 * 
 * @author Adriel L. V. Mori, Igor Pádua e Bruna Espírito
 */

public interface UserRepository extends JpaRepository<User, Long> {// tipo da entidade, tipo do Id da entidade

	User findByEmail(String email);//Busca emails
}
