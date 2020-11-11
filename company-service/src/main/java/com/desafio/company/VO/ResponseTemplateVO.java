package com.desafio.company.VO;

import java.util.List;

import com.desafio.company.entity.Company;

public class ResponseTemplateVO {

<<<<<<< HEAD
	private CompanyVO companyVO;
	private String msg;
=======
	private List<User> users;
	private Company company;
<<<<<<< HEAD
	private String msg;
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2

	public ResponseTemplateVO() {
		super();
	}

<<<<<<< HEAD
	public ResponseTemplateVO(CompanyVO companyVO, String msg) {
		super();
		this.companyVO = companyVO;
		this.msg = msg;
	}

	public CompanyVO getCompanyVO() {
		return companyVO;
	}

	public void setCompanyVO(CompanyVO companyVO) {
		this.companyVO = companyVO;
	}

=======
<<<<<<< HEAD
	public ResponseTemplateVO(List<User> users, Company company, String msg) {
		super();
		this.users = users;
		this.company = company;
		this.msg = msg;
=======
	public ResponseTemplateVO(List<User> users, Company company) {
		super();
		this.users = users;
		this.company = company;
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

<<<<<<< HEAD
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

<<<<<<< HEAD
=======
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
}
