package com.desafio.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.person.entity.Funcionario;
import com.desafio.person.entity.Pessoa;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	Funcionario findFuncionarioByPessoa(Pessoa pessoa);

	Funcionario findFuncionarioByCnpj(Long cnpj);

}
