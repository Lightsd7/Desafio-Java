package com.desafio.company.VO;

public class UserVO {

	private Long cpf;
	private String name;
	private String lastName;
	private PartnerVO partnerVO;
	private CompanyVO companyVO;

	public UserVO() {
		super();
	}

	public UserVO(Long cpf, String name, String lastName, PartnerVO partnerVO, CompanyVO companyVO) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.lastName = lastName;
		this.partnerVO = partnerVO;
		this.companyVO = companyVO;
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
	}

}
