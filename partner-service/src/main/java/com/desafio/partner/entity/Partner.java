package com.desafio.partner.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "partners")
public class Partner {

	@Id
	private Long cpfPartner;
	private String name;
	private String lastName;
	private Boolean isMarried;
	private String msg;
	@Column(name = "cpf", nullable = false)
	private Long cpf;

	public Partner() {
		super();
	}

	public Partner(String msg) {
		super();
		this.msg = msg;
	}

	public Partner(Long cpfPartner, String name, String lastName, Boolean isMarried, String msg, Long cpf) {
		super();
		this.cpfPartner = cpfPartner;
		this.name = name;
		this.lastName = lastName;
		this.isMarried = isMarried;
		this.msg = msg;
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

	public Boolean getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(Boolean isMarried) {
		this.isMarried = isMarried;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
