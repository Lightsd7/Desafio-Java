package com.desafio.partner.VO;

import com.desafio.partner.entity.Partner;

public class ResponseTemplateVO {

	private Partner partner;
	private User user;

	public ResponseTemplateVO() {
		super();
	}

	public ResponseTemplateVO(Partner partner, User user) {
		super();
		this.partner = partner;
		this.user = user;
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

}
