package com.desafio.person.VO;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Partner {

	@Id
	private Long cpfPartner;
	private String name;
	private String lastName;
}
