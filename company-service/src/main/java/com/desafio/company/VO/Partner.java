package com.desafio.company.VO;

import javax.persistence.Id;

public class Partner {

	@Id
	private Long cpfPartner;
	private String name;
	private String lastName;
//	@OneToOne(mappedBy = "cpfPartner", cascade = CascadeType.ALL)
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "users_cpf")
//	private User user;

	public Partner() {
		super();
	}

	public Partner(Long cpfPartner, String name, String lastName) {
		super();
		this.cpfPartner = cpfPartner;
		this.name = name;
		this.lastName = lastName;
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

}
