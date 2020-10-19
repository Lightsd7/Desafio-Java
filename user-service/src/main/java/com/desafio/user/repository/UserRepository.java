package com.desafio.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByCpf(Long cpf);
}
