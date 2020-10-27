package com.desafio.company.VO;

import java.util.List;

import com.desafio.company.entity.Company;

public class ResponseTemplateVO {

	private CompanyVO companyVO;
	private String msg;

	public ResponseTemplateVO() {
		super();
	}

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

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
