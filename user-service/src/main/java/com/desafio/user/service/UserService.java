package com.desafio.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafio.user.VO.Company;
<<<<<<< HEAD
import com.desafio.user.VO.Partner;
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
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
		Company company = this.findCompany(user.getCnpj());
		if (company.getCnpj() != null) {
			return userRepository.save(user);
		} else {
			return new User("Não foi possível cadastrar usuário, pois CNPJ inexistente.");
		}
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
