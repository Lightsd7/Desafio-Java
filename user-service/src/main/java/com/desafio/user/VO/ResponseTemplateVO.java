package com.desafio.user.VO;

import com.desafio.user.entity.User;

public class ResponseTemplateVO {

	private User user;
	private Company company;
	private Partner partner;
	private String msg;

	public ResponseTemplateVO() {
		super();
	}

	public ResponseTemplateVO(User user, Company company, Partner partner, String msg) {
		super();
		this.user = user;
		this.company = company;
		this.partner = partner;
		this.msg = msg;
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

	public Partner getPartner() {
		return partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
