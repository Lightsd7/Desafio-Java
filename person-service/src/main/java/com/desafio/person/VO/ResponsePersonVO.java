package com.desafio.person.VO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponsePersonVO {

	private List<PersonVO> personsVO;
	private String msg;
}
