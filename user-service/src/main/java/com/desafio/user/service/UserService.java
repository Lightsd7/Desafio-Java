package com.desafio.user.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafio.user.VO.Company;
<<<<<<< HEAD
import com.desafio.user.VO.Partner;
import com.desafio.user.VO.ResponseTemplateVO;
import com.desafio.user.VO.UserVO;
=======
<<<<<<< HEAD
import com.desafio.user.VO.Partner;
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
import com.desafio.user.VO.ResponseTemplateVO;
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
import com.desafio.user.entity.User;
import com.desafio.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

<<<<<<< HEAD
	public ResponseTemplateVO saveUser(User user) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Company company = this.findCompany(user.getCnpj());
		if (company.getCnpj() != null) {
			if (userRepository.findUserByCpf(user.getCpf()) != null) {
//				return new User("Usuário já existe"); 
				vo.setMsg("Usuário já existe.");
				return vo;
			}
			if (findPartner(user.getCpfPartner()) != null) {
				vo.setMsg("CPF do Cônjuge já existe.");
				return vo;
			}
//			return userRepository.save(user);
			user = userRepository.save(user);
			UserVO temp2 = new UserVO();
			temp2.setCompany(company);
			temp2.setPartner(this.findPartner(user.getCpfPartner()));
			temp2.setCpf(user.getCpf());
			temp2.setName(user.getName());
			temp2.setLastName(user.getLastName());
			vo.getUsersVO().add(temp2);
			
			return vo;
		} else {
//			return new User("Não foi possível cadastrar usuário, pois CNPJ inexistente.");
			vo.setMsg("Não foi possível cadastrar usuário, pois CNPJ é inexistente.");
			return vo;
		}
	}

	public User findUserByCpf(Long cpf) {
		return userRepository.findUserByCpf(cpf);
	}

	public ResponseTemplateVO findAll() {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		List<User> temp = userRepository.findAll();
		vo.setUsersVO(new ArrayList<UserVO>());
		for (User user : temp) {
			Company company = this.findCompany(user.getCnpj());
			Partner partner = new Partner();
			if(user.getCpfPartner() != null) {
				partner = this.findPartner(user.getCpfPartner());
			}
			UserVO temp2 = new UserVO();
			temp2.setCompany(company);
			temp2.setPartner(partner);
			temp2.setCpf(user.getCpf());
			temp2.setName(user.getName());
			temp2.setLastName(user.getLastName());
			vo.getUsersVO().add(temp2);
		}
		return vo;
	}

	public List<User> findByCnpj(Long cnpj) {
//		List<User> temp = userRepository.findByCnpj(cnpj);
//		for (User user : temp) {
//			Partner partner = restTemplate.getForObject("http://localhost:9007/partners/" + user.getCpfPartner(), Partner.class);
//			user.setCpfPartner(partner);
//		}
//		return temp;
		return userRepository.findByCnpj(cnpj);
	}

	public ResponseTemplateVO getUserWithCompany(Long cpf) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		try {
			User user = userRepository.findUserByCpf(cpf);
			Company company = restTemplate.getForObject("http://localhost:9092/companies/" + user.getCnpj(),
					Company.class);
			UserVO temp2 = new UserVO();
			temp2.setCompany(company);
			temp2.setPartner(this.findPartner(user.getCpfPartner()));
			temp2.setCpf(user.getCpf());
			temp2.setName(user.getName());
			temp2.setLastName(user.getLastName());
			vo.getUsersVO().add(temp2);
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde.");
		}

		return vo;
	}

//	public ResponseTemplateVO getUserWithPartner(Long cpf) {
//		ResponseTemplateVO vo = new ResponseTemplateVO();
//		User user = userRepository.findUserByCpf(cpf);
//
//		Partner partner = restTemplate.getForObject("http://localhost:9007/partners/" + user.getCpfPartner(),
//				Partner.class);
//		vo.setUser(user);
//		vo.setPartner(partner);
//		return vo;
//	}

	private Company findCompany(Long cnpj) {
		Company company = restTemplate.getForObject("http://localhost:9092/companies/" + cnpj, Company.class);
		return company;
=======
	public User saveUser(User user) {
		Company company = this.findCompany(user.getCnpj());
		if (company.getCnpj() != null) {
			return userRepository.save(user);
		} else {
			return new User("Não foi possível cadastrar usuário, pois CNPJ inexistente.");
		}
	}

	public User findUserByCpf(Long cpf) {
		return userRepository.findUserByCpf(cpf);
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
	}

	private Partner findPartner(Long cpfPartner) {
		Partner partner = restTemplate.getForObject("http://localhost:9007/partners/" + cpfPartner, Partner.class);
		return partner;
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

	public List<User> findByCnpj(Long cnpj) {
		return userRepository.findByCnpj(cnpj);
	}

	public ResponseTemplateVO getUserWithCompany(Long cpf) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		try {
			User user = userRepository.findUserByCpf(cpf);

			Company company = restTemplate.getForObject("http://localhost:9092/companies/" + user.getCnpj(),
					Company.class);
			vo.setPartner(this.findPartner(user.getCpfPartner()));
			vo.setUser(user);
			vo.setCompany(company);
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde.");
		}

		return vo;
	}

//	public ResponseTemplateVO getUserWithPartner(Long cpf) {
//		ResponseTemplateVO vo = new ResponseTemplateVO();
//		User user = userRepository.findUserByCpf(cpf);
//
//		Partner partner = restTemplate.getForObject("http://localhost:9007/partners/" + user.getCpfPartner(),
//				Partner.class);
//		vo.setUser(user);
//		vo.setPartner(partner);
//		return vo;
//	}

	private Company findCompany(Long cnpj) {
		Company company = restTemplate.getForObject("http://localhost:9092/companies/" + cnpj, Company.class);
		return company;
	}

	private Partner findPartner(Long cpfPartner) {
		Partner partner = restTemplate.getForObject("http://localhost:9007/partners/" + cpfPartner, Partner.class);
		return partner;
	}

}
