package com.desafio.company.VO;

public class ResponseCompanyVO {

//	private List<CompanyVO> companiesVO;
	private CompanyVO companyVO;
	private String msg;

	public ResponseCompanyVO() {
		super();
	}

	public ResponseCompanyVO(CompanyVO companyVO, String msg) {
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
