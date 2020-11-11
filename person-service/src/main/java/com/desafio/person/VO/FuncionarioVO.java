package com.desafio.person.VO;

import com.desafio.person.entity.Pessoa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioVO {

	private Long id;
	private Long cnpj;
	private Pessoa pessoa;
	private Pessoa conjuge;
}
