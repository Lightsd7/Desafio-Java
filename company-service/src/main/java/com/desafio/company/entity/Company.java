package com.desafio.company.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.validation.constraints.NotNull;
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee

@Entity(name = "companies")
public class Company {

	@Id
	private Long cnpj;
	private String razaoSocial;
	private String nomeFantasia;
<<<<<<< HEAD
	private String msg;
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee

	public Company() {
		super();
	}

<<<<<<< HEAD
	public Company(String msg) {
		super();
		this.setMsg(msg);
	}

=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
	public Company(Long cnpj, String razaoSocial, String nomeFantasia) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

<<<<<<< HEAD
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee

}
