package com.desafio.person.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "pessoa")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

	@Id
	@OneToOne(mappedBy = "cpf", cascade = CascadeType.ALL)
	private Long cpf;
	private String name;
	private String lastName;

}
