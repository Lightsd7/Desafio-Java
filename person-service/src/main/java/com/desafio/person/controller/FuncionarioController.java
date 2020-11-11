package com.desafio.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.desafio.person.VO.ResponseFuncionarioVO;
import com.desafio.person.entity.Funcionario;
import com.desafio.person.service.FuncionarioService;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@Autowired
	private FuncionarioService funcionarioService;
	
	@PostMapping("/")
	public ResponseFuncionarioVO saveFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioService.saveFuncionario(funcionario);
	}
	
	@GetMapping()
	public ResponseFuncionarioVO findAll() {
		return funcionarioService.findAll();
	}
	
	@GetMapping("/cpf/{id}")
	public ResponseFuncionarioVO findFuncionarioByPessoa(@PathVariable("id") Long cpf) {
		return funcionarioService.findFuncionarioByPessoa(cpf);
	}
	
	@GetMapping("/cnpj/{cnpj}")
	public ResponseFuncionarioVO findByCnpj(@PathVariable Long cnpj) {
		return funcionarioService.findByCnpj(cnpj);
	}
}
