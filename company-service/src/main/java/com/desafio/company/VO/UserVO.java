package com.desafio.company.VO;

public class UserVO {

	private Long cpf;
	private String name;
	private String lastName;
<<<<<<< HEAD
	private Partner partner;
//	private CompanyVO companyVO;
=======
	private PartnerVO partnerVO;
	private CompanyVO companyVO;
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb

	public UserVO() {
		super();
	}

<<<<<<< HEAD
	public UserVO(Long cpf, String name, String lastName, Partner partner, CompanyVO companyVO) {
=======
	public UserVO(Long cpf, String name, String lastName, PartnerVO partnerVO, CompanyVO companyVO) {
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
		super();
		this.cpf = cpf;
		this.name = name;
		this.lastName = lastName;
<<<<<<< HEAD
		this.partner = partner;
//		this.companyVO = companyVO;
=======
		this.partnerVO = partnerVO;
		this.companyVO = companyVO;
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
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
	public Partner getPartnerVO() {
		return partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
=======
	public PartnerVO getPartnerVO() {
		return partnerVO;
	}

	public void setPartnerVO(PartnerVO partnerVO) {
		this.partnerVO = partnerVO;
	}

	public CompanyVO getCompanyVO() {
		return companyVO;
	}

	public void setCompanyVO(CompanyVO companyVO) {
		this.companyVO = companyVO;
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
	}

}
