package com.desafio.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.person.VO.Partner;
import com.desafio.person.VO.ResponsePartnerVO;
import com.desafio.person.VO.ResponsePersonVO;
import com.desafio.person.entity.Pessoa;
import com.desafio.person.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@PostMapping("/")
	public ResponsePersonVO savePerson(@RequestBody Pessoa person) {
		return personService.savePerson(person);
	}
	
	@PostMapping("/partner/")
	public ResponsePartnerVO savePartner(@RequestBody Partner partner) {
		return personService.savePartner(partner);
	}

	@GetMapping()
	public ResponsePersonVO findAll() {
		return personService.findAll();
	}
	
	@GetMapping("/cpf/{id}")
	public ResponsePersonVO findPessoaByCpf(@PathVariable("id") Long cpf) {
		return personService.findPessoaByCpf(cpf);
	}
	
	@GetMapping("/cnpj/{cnpj}")
	public ResponsePersonVO findByCnpj(@PathVariable Long cnpj) {
		return personService.findByCnpj(cnpj);
	}
	
}
