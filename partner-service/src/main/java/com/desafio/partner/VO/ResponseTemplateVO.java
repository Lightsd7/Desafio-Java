package com.desafio.partner.VO;

import com.desafio.partner.entity.Partner;

public class ResponseTemplateVO {

	private Partner partner;
	private User user;
	private String msg;

	public ResponseTemplateVO() {
		super();
	}

	public ResponseTemplateVO(Partner partner, User user, String msg) {
		super();
		this.partner = partner;
		this.user = user;
		this.setMsg(msg);
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

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
