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
<<<<<<< HEAD
	private String msg;
=======
	private Boolean isMarried;
<<<<<<< HEAD
	private String msg;
=======
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
	@Column(name = "cpf", nullable = false)
	private Long cpf;

	public Partner() {
		super();
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
	public Partner(String msg) {
		super();
		this.msg = msg;
	}

<<<<<<< HEAD
	public Partner(Long cpfPartner, String name, String lastName, String msg, Long cpf) {
=======
	public Partner(Long cpfPartner, String name, String lastName, Boolean isMarried, String msg, Long cpf) {
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
		super();
		this.cpfPartner = cpfPartner;
		this.name = name;
		this.lastName = lastName;
<<<<<<< HEAD
		this.msg = msg;
=======
		this.isMarried = isMarried;
		this.msg = msg;
=======
	public Partner(String name, String lastName, Long cpfPartner, Boolean isMarried, Long cpf) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.cpfPartner = cpfPartner;
		this.isMarried = isMarried;
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
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

<<<<<<< HEAD
=======
	public Boolean getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(Boolean isMarried) {
		this.isMarried = isMarried;
	}

>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

<<<<<<< HEAD
=======
=======
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
}
