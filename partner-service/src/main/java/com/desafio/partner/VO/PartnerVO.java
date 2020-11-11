package com.desafio.partner.VO;

public class PartnerVO {

	private Long cpfPartner;
	private String name;
	private String lastName;
	private String msg;

	public PartnerVO() {
		super();
	}

	public PartnerVO(Long cpfPartner, String name, String lastName, String msg) {
		super();
		this.cpfPartner = cpfPartner;
		this.name = name;
		this.lastName = lastName;
		this.msg = msg;
	}

	public Long getCpfPartner() {
		return cpfPartner;
	}

	public void setCpfPartner(Long cpfPartner) {
		this.cpfPartner = cpfPartner;
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

}
