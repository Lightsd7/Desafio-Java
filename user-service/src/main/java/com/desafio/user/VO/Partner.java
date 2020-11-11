package com.desafio.user.VO;

<<<<<<< HEAD
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.desafio.user.entity.User;

//@Entity(name = "partners")
=======
import javax.persistence.Id;

>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
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
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2

	public Partner() {
		super();
	}

<<<<<<< HEAD
	public Partner(Long cpfPartner, String name, String lastName) {
=======
	public Partner(Long cpfPartner, String name, String lastName, Boolean isMarried) {
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
		super();
		this.cpfPartner = cpfPartner;
		this.name = name;
		this.lastName = lastName;
<<<<<<< HEAD
=======
		this.isMarried = isMarried;
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
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

>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
}
