package com.desafio.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafio.user.VO.Company;
import com.desafio.user.VO.ResponseTemplateVO;
import com.desafio.user.entity.User;
import com.desafio.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public User findUserByCpf(Long cpf) {
		return userRepository.findUserByCpf(cpf);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public List<User> findByCnpj(Long cnpj) {
		return userRepository.findByCnpj(cnpj);
	}

	public ResponseTemplateVO getUserWithCompany(Long cpf) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findUserByCpf(cpf);

		Company company = restTemplate.getForObject("http://localhost:9092/companies/" + user.getCnpj(), Company.class);
		vo.setUser(user);
		vo.setCompany(company);
		return vo;
	}

}
