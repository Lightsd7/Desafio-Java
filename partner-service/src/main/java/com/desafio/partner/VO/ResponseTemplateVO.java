package com.desafio.partner.VO;

import com.desafio.partner.entity.Partner;

public class ResponseTemplateVO {

	private Partner partner;
	private User user;
<<<<<<< HEAD
	private String msg;
=======
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2

	public ResponseTemplateVO() {
		super();
	}

<<<<<<< HEAD
	public ResponseTemplateVO(Partner partner, User user, String msg) {
		super();
		this.partner = partner;
		this.user = user;
		this.setMsg(msg);
=======
	public ResponseTemplateVO(Partner partner, User user) {
		super();
		this.partner = partner;
		this.user = user;
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
	}

	public Partner getPartner() {
		return partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

<<<<<<< HEAD
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

=======
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
}
