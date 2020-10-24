package com.desafio.company.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "users")
public class User {

	@Id
	private Long cpf;
	private String name;
	private String lastName;
	@Column(name = "cpfPartner")
	private Long cpfPartner;

	public User() {
		super();
	}

	public User(Long cpf, String name, String lastName, Long cpfPartner) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.lastName = lastName;
		this.cpfPartner = cpfPartner;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getCpfPartner() {
		return cpfPartner;
	}

	public void setCpfPartner(Long cpfPartner) {
		this.cpfPartner = cpfPartner;
	}

}
