package com.desafio.user.entity;

<<<<<<< HEAD
import javax.persistence.CascadeType;
=======
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.desafio.user.VO.Partner;

@Entity(name = "users")
public class User {

	@Id
	private Long cpf;
	private String name;
	private String lastName;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
	private String msg;
	@Column(name = "cnpj", nullable = false)
	private Long cnpj;
	@Column(name = "cpfPartner")
<<<<<<< HEAD
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "partners_cpf_partner")
//	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Long cpfPartner;
=======
	private Long cpfPartner;
=======
	@Column(name = "cnpj", nullable = false)
	private Long cnpj;
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2

	public User() {
		super();
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
	public User(String msg) {
		super();
		this.msg = msg;
	}

	public User(Long cpf, String name, String lastName, Long cnpj, Long cpfPartner, String msg) {
<<<<<<< HEAD
=======
=======
	public User(Long cpf, String name, String lastName, Long cnpj) {
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
		super();
		this.cpf = cpf;
		this.name = name;
		this.lastName = lastName;
		this.cnpj = cnpj;
<<<<<<< HEAD
		this.cpfPartner = cpfPartner;
		this.msg = msg;
=======
<<<<<<< HEAD
		this.cpfPartner = cpfPartner;
		this.msg = msg;
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
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
=======
<<<<<<< HEAD
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
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

<<<<<<< HEAD
=======
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
}
