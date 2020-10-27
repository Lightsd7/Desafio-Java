package com.desafio.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findUserByCpf(Long cpf);
	
	List<User> findByCnpj(Long cnpj);
}
