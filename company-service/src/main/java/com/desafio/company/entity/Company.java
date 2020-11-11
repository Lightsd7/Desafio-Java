package com.desafio.company.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
<<<<<<< HEAD
=======
<<<<<<< HEAD
import javax.validation.constraints.NotNull;
=======
<<<<<<< HEAD
import javax.validation.constraints.NotNull;
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb

@Entity(name = "companies")
public class Company {

	@Id
	private Long cnpj;
	private String razaoSocial;
	private String nomeFantasia;
<<<<<<< HEAD
=======
<<<<<<< HEAD
	private String msg;
=======
<<<<<<< HEAD
	private String msg;
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb

	public Company() {
		super();
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
	public Company(String msg) {
		super();
		this.setMsg(msg);
	}

<<<<<<< HEAD
=======
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
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
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
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

>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
}
