package com.desafio.user.VO;

public class ResponseCompanyVO {

	private Company company;
	private String msg;

	public ResponseCompanyVO() {
		super();
	}

	public ResponseCompanyVO(Company company, String msg) {
		super();
		this.company = company;
		this.msg = msg;
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
