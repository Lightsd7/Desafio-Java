package com.desafio.company.VO;

public class UserVO {

	private Long cpf;
	private String name;
	private String lastName;
	private Partner partner;
//	private CompanyVO companyVO;

	public UserVO() {
		super();
	}

	public UserVO(Long cpf, String name, String lastName, Partner partner, CompanyVO companyVO) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.lastName = lastName;
		this.partner = partner;
//		this.companyVO = companyVO;
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

	public Partner getPartnerVO() {
		return partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

}
