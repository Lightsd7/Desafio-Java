package com.desafio.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {

	private Long cpf;
	private String name;
	private String lastName;
	private String msg;
//	private Company company;
	private PartnerVO partner;

}
