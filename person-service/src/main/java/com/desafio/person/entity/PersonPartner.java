package com.desafio.person.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonPartner {
	
	private Long cpf;
	private Long cpfPartner;
}
