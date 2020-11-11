package com.desafio.company.VO;

import javax.persistence.Id;

public class Partner {

	@Id
	private Long cpfPartner;
	private String name;
	private String lastName;
<<<<<<< HEAD
//	@OneToOne(mappedBy = "cpfPartner", cascade = CascadeType.ALL)
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "users_cpf")
//	private User user;
=======
	private Boolean isMarried;
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb

	public Partner() {
		super();
	}

<<<<<<< HEAD
	public Partner(Long cpfPartner, String name, String lastName) {
=======
	public Partner(Long cpfPartner, String name, String lastName, Boolean isMarried) {
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
		super();
		this.cpfPartner = cpfPartner;
		this.name = name;
		this.lastName = lastName;
<<<<<<< HEAD
=======
		this.isMarried = isMarried;
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
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

<<<<<<< HEAD
=======
	public Boolean getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(Boolean isMarried) {
		this.isMarried = isMarried;
	}

>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
}
