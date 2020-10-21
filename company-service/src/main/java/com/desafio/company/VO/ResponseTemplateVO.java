package com.desafio.company.VO;

import java.util.List;

import com.desafio.company.entity.Company;

public class ResponseTemplateVO {

	private List<User> users;
	private Company company;

	public ResponseTemplateVO() {
		super();
	}

	public ResponseTemplateVO(List<User> users, Company company) {
		super();
		this.users = users;
		this.company = company;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
