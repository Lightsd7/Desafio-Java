package com.desafio.company.VO;

<<<<<<< HEAD
import javax.persistence.Column;
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "users")
public class User {

	@Id
	private Long cpf;
	private String name;
	private String lastName;
<<<<<<< HEAD
	@Column(name = "cpfPartner")
	private Long cpfPartner;
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee

	public User() {
		super();
	}

<<<<<<< HEAD
	public User(Long cpf, String name, String lastName, Long cpfPartner) {
=======
	public User(Long cpf, String name, String lastName) {
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
		super();
		this.cpf = cpf;
		this.name = name;
		this.lastName = lastName;
<<<<<<< HEAD
		this.cpfPartner = cpfPartner;
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
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
	public Long getCpfPartner() {
		return cpfPartner;
	}

	public void setCpfPartner(Long cpfPartner) {
		this.cpfPartner = cpfPartner;
	}

=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
}
