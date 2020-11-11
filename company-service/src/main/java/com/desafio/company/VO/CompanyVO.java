package com.desafio.company.VO;

import java.util.List;

<<<<<<< HEAD
=======
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
//@Entity(name = "companies")
public class CompanyVO {

	private Long cnpj;
	private String razaoSocial;
	private String nomeFantasia;
<<<<<<< HEAD
=======
	private String msg;
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
	private List<UserVO> usersVO;
	
	public CompanyVO() {
		super();
	}

<<<<<<< HEAD
=======
	public CompanyVO(String msg) {
		super();
		this.setMsg(msg);
	}

>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
	public CompanyVO(Long cnpj, String razaoSocial, String nomeFantasia) {
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
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
	public List<UserVO> getUsersVO() {
		return usersVO;
	}

	public void setUsersVO(List<UserVO> usersVO) {
		this.usersVO = usersVO;
	}

}
