package com.desafio.person.VO;

import com.desafio.person.entity.Pessoa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartnerVO {
	
	private Long cpf;
	private String name;
	private String lastName;
//	private Person person;
}
