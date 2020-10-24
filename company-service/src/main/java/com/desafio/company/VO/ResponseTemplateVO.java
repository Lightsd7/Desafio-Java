package com.desafio.company.VO;

import java.util.List;

import com.desafio.company.entity.Company;

public class ResponseTemplateVO {

	private List<User> users;
	private Company company;
	private String msg;

	public ResponseTemplateVO() {
		super();
	}

	public ResponseTemplateVO(List<User> users, Company company, String msg) {
		super();
		this.users = users;
		this.company = company;
		this.msg = msg;
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

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
