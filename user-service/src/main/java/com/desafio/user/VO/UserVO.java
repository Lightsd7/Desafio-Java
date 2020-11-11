package com.desafio.user.VO;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
=======
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
public class UserVO {

	private Long cpf;
	private String name;
	private String lastName;
	private String msg;
<<<<<<< HEAD
//	private Company company;
	private PartnerVO partner;
=======
	private Company company;
	private Partner partner;

	public UserVO() {
		super();
	}

	public UserVO(String msg) {
		super();
		this.msg = msg;
	}

	public UserVO(Long cpf, String name, String lastName, String msg, Company company, Partner partner) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.lastName = lastName;
		this.msg = msg;
		this.company = company;
		this.partner = partner;
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

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Partner getPartner() {
		return partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb

}
