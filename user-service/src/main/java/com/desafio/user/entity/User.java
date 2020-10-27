package com.desafio.user.entity;

import javax.persistence.CascadeType;
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
	private String msg;
	@Column(name = "cnpj", nullable = false)
	private Long cnpj;
	@Column(name = "cpfPartner")
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "partners_cpf_partner")
//	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Long cpfPartner;

	public User() {
		super();
	}

	public User(String msg) {
		super();
		this.msg = msg;
	}

	public User(Long cpf, String name, String lastName, Long cnpj, Long cpfPartner, String msg) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.lastName = lastName;
		this.cnpj = cnpj;
		this.cpfPartner = cpfPartner;
		this.msg = msg;
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

}
