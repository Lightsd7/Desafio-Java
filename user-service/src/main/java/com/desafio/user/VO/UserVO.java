package com.desafio.user.VO;

public class UserVO {

	private Long cpf;
	private String name;
	private String lastName;
	private String msg;
	private Company company;
	private Partner partner;

	public UserVO() {
		super();
	}

	public UserVO(String msg) {
		super();
		this.msg = msg;
	}

	public UserVO(Long cpf, String name, String lastName, String msg, Company company, Partner partner) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.lastName = lastName;
		this.msg = msg;
		this.company = company;
		this.partner = partner;
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

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Partner getPartner() {
		return partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

}
