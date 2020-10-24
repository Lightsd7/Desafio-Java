package com.desafio.user.VO;

import com.desafio.user.entity.User;

public class ResponseTemplateVO {

	private User user;
	private Company company;
<<<<<<< HEAD
	private Partner partner;
	private String msg;
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee

	public ResponseTemplateVO() {
		super();
	}

<<<<<<< HEAD
	public ResponseTemplateVO(User user, Company company, Partner partner, String msg) {
		super();
		this.user = user;
		this.company = company;
		this.partner = partner;
		this.msg = msg;
=======
	public ResponseTemplateVO(User user, Company company) {
		super();
		this.user = user;
		this.company = company;
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
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

<<<<<<< HEAD
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

=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
}
