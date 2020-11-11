package com.desafio.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.person.VO.Partner;
import com.desafio.person.entity.Pessoa;

@Repository
public interface PersonRepository extends JpaRepository<Pessoa, Long>{
	
	Pessoa findPessoaByCpf(Long cpf);
				
}
