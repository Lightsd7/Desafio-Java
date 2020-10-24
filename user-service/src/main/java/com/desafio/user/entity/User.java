package com.desafio.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "users")
public class User {

	@Id
	private Long cpf;
	private String name;
	private String lastName;
<<<<<<< HEAD
	private String msg;
	@Column(name = "cnpj", nullable = false)
	private Long cnpj;
	@Column(name = "cpfPartner")
	private Long cpfPartner;
=======
	@Column(name = "cnpj", nullable = false)
	private Long cnpj;
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee

	public User() {
		super();
	}

<<<<<<< HEAD
	public User(String msg) {
		super();
		this.msg = msg;
	}

	public User(Long cpf, String name, String lastName, Long cnpj, Long cpfPartner, String msg) {
=======
	public User(Long cpf, String name, String lastName, Long cnpj) {
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
		super();
		this.cpf = cpf;
		this.name = name;
		this.lastName = lastName;
		this.cnpj = cnpj;
<<<<<<< HEAD
		this.cpfPartner = cpfPartner;
		this.msg = msg;
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
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

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

<<<<<<< HEAD
	public Long getCpfPartner() {
		return cpfPartner;
	}

	public void setCpfPartner(Long cpfPartner) {
		this.cpfPartner = cpfPartner;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
}
