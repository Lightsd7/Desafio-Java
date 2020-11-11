package com.desafio.user.VO;

public class ResponsePartnerVO {

	private PartnerVO partnerVO;
	private String msg;

	public ResponsePartnerVO() {
		super();
	}

	public ResponsePartnerVO(PartnerVO partnerVO, String msg) {
		super();
		this.partnerVO = partnerVO;
		this.msg = msg;
	}

	public PartnerVO getPartnerVO() {
		return partnerVO;
	}

	public void setPartnerVO(PartnerVO partnerVO) {
		this.partnerVO = partnerVO;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	

}
