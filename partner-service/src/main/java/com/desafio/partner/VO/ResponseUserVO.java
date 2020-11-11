package com.desafio.partner.VO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseUserVO {

	private List<UserVO> usersVO;
	private String msg;
}
