package com.desafio.user.VO;

import com.desafio.user.entity.User;

public class ResponseTemplateVO {

	private User user;
	private Company company;

	public ResponseTemplateVO() {
		super();
	}

	public ResponseTemplateVO(User user, Company company) {
		super();
		this.user = user;
		this.company = company;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
