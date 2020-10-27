package com.desafio.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.user.VO.ResponseTemplateVO;
import com.desafio.user.entity.User;
import com.desafio.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/")
	public ResponseTemplateVO saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@GetMapping()
	public ResponseTemplateVO findAll() {
		return userService.findAll();
	}
	
	@GetMapping("/cpf/{id}")
	public User findUserByCpf(@PathVariable("id") Long cpf) {
		return userService.findUserByCpf(cpf);
	}

	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithCompany(@PathVariable("id") Long cpf) {
		return userService.getUserWithCompany(cpf);
	}

	@GetMapping("/cnpj/{cnpj}")
	public List<User> findByCnpj(@PathVariable Long cnpj) {
		return userService.findByCnpj(cnpj);
	}

//	@GetMapping("/partner/{cpfPartner}")
//	public ResponseTemplateVO getUserWithPartner(@PathVariable("cpfPartner") Long cpfPartner) {
//		return userService.getUserWithPartner(cpfPartner);
//	}

}
