package com.desafio.person.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonVO {

	private Long cpf;
	private String name;
	private String lastName;
	private Company company;
	private Partner partner;
	private String msg;
	
}
