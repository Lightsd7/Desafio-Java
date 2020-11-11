package com.desafio.person.VO;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

	@Id
	private Long cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	
}
