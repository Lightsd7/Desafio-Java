package com.desafio.user.VO;

import javax.persistence.Id;

public class Partner {

	@Id
	private Long cpfPartner;
	private String name;
	private String lastName;
	private Boolean isMarried;

	public Partner() {
		super();
	}

	public Partner(Long cpfPartner, String name, String lastName, Boolean isMarried) {
		super();
		this.cpfPartner = cpfPartner;
		this.name = name;
		this.lastName = lastName;
		this.isMarried = isMarried;
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

	public Boolean getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(Boolean isMarried) {
		this.isMarried = isMarried;
	}

}
