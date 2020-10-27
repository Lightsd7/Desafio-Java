package com.desafio.user.VO;

import java.util.List;

import com.desafio.user.entity.User;

public class ResponseTemplateVO {

	private List<UserVO> usersVO;
	private String msg;

	public ResponseTemplateVO() {
		super();
	}

	public ResponseTemplateVO(List<UserVO> usersVO, String msg) {
		super();
		this.setUsersVO(usersVO);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<UserVO> getUsersVO() {
		return usersVO;
	}

	public void setUsersVO(List<UserVO> usersVO) {
		this.usersVO = usersVO;
	}

}
