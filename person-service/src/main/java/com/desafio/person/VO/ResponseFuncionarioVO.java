package com.desafio.person.VO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseFuncionarioVO {

	private List<FuncionarioVO> funcionariosVO;
	private String msg;
}
