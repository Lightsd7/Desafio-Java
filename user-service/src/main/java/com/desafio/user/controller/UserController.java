package com.desafio.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import com.desafio.user.VO.ResponseUserVO;
=======
import com.desafio.user.VO.ResponseTemplateVO;
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
import com.desafio.user.entity.User;
import com.desafio.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/")
<<<<<<< HEAD
	public ResponseUserVO saveUser(@RequestBody User user) {
=======
	public ResponseTemplateVO saveUser(@RequestBody User user) {
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
		return userService.saveUser(user);
	}

	@GetMapping()
<<<<<<< HEAD
	public ResponseUserVO findAll() {
=======
	public ResponseTemplateVO findAll() {
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
		return userService.findAll();
	}
	
<<<<<<< HEAD
	@GetMapping("/cpf/{id}")
	public User findUserByCpf(@PathVariable("id") Long cpf) {
=======
	@GetMapping("/users/{id}")
	public User findUserByCpf(Long cpf) {
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
		return userService.findUserByCpf(cpf);
	}

<<<<<<< HEAD
	@GetMapping("/cpf/{id}")
	public ResponseUserVO findUserByCpf(@PathVariable("id") Long cpf) {
		return userService.findUserByCpf(cpf);
	}

	@GetMapping("/{id}")
	public ResponseUserVO getUserWithCompany(@PathVariable("id") Long cpf) {
		return userService.getUserWithCompany(cpf);
	}

	@GetMapping("/cnpj/{cnpj}")
	public ResponseUserVO findByCnpj(@PathVariable Long cnpj) {
		return userService.findByCnpj(cnpj);
	}

//	@GetMapping("/partner/{cpfPartner}")
//	public ResponseUserVO getUserWithPartner(@PathVariable("cpfPartner") Long cpfPartner) {
//		return userService.getUserWithPartner(cpfPartner);
//	}

=======
	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithCompany(@PathVariable("id") Long cpf) {
		return userService.getUserWithCompany(cpf);
	}

<<<<<<< HEAD
	@GetMapping("/cnpj/{cnpj}")
	public List<User> findByCnpj(@PathVariable Long cnpj) {
		return userService.findByCnpj(cnpj);
	}

=======
<<<<<<< HEAD
=======
	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithCompany(@PathVariable("id") Long cpf) {
		return userService.getUserWithCompany(cpf);
	}
	
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
	@GetMapping("/cnpj/{cnpj}")
	public List<User> findByCnpj(@PathVariable Long cnpj) {
		return userService.findByCnpj(cnpj);
	}

<<<<<<< HEAD
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
//	@GetMapping("/partner/{cpfPartner}")
//	public ResponseTemplateVO getUserWithPartner(@PathVariable("cpfPartner") Long cpfPartner) {
//		return userService.getUserWithPartner(cpfPartner);
//	}

<<<<<<< HEAD
=======
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
}
