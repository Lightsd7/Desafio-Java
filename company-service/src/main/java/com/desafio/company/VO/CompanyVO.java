package com.desafio.company.VO;

import java.util.List;

//@Entity(name = "companies")
public class CompanyVO {

	private Long cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private List<UserVO> usersVO;
	
	public CompanyVO() {
		super();
	}

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

	public List<UserVO> getUsersVO() {
		return usersVO;
	}

	public void setUsersVO(List<UserVO> usersVO) {
		this.usersVO = usersVO;
	}

}
