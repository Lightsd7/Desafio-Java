package com.desafio.user.service;

import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Collection;
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafio.user.VO.Company;
<<<<<<< HEAD
import com.desafio.user.VO.ResponseCompanyVO;
import com.desafio.user.VO.ResponsePartnerVO;
import com.desafio.user.VO.ResponseUserVO;
import com.desafio.user.VO.UserVO;
=======
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
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
import com.desafio.user.entity.User;
import com.desafio.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

<<<<<<< HEAD
	public ResponseUserVO saveUser(User user) {
		ResponseUserVO vo = new ResponseUserVO();
		ResponseCompanyVO company = this.findCompany(user.getCnpj());
		if (company.getMsg() == null) {
			if (userRepository.findUserByCpf(user.getCpf()) != null
					|| userRepository.findUserByCpf(user.getCpfPartner()) != null) {
				vo.setMsg("Funcionário já existe ou dependente já é funcionário.");
				return vo;
			}
			ResponsePartnerVO partner = new ResponsePartnerVO();
			partner = this.findPartner(user.getCpf());
			if (partner != null && partner.getPartnerVO() != null
					&& partner.getPartnerVO().getCpfPartner().longValue() == user.getCpf().longValue()) {
				vo.setMsg("CPF já existe.");
				return vo;
			}
			ResponsePartnerVO temp = new ResponsePartnerVO();
			temp = this.findPartner(user.getCpfPartner());
			if (user.getCpfPartner() != temp.getPartnerVO().getCpfPartner()) {
				vo.setMsg("Esse dependente já possui funcionário.");
				return vo;
			}
			user = userRepository.save(user);
			UserVO temp2 = new UserVO();
			temp2.setCpf(user.getCpf());
			temp2.setName(user.getName());
			temp2.setLastName(user.getLastName());
			vo.setUsersVO(new ArrayList<UserVO>());
			vo.getUsersVO().add(temp2);
			return vo;
		} else {
			vo.setMsg(
					"Não foi possível cadastrar usuário, pois CNPJ é inexistente ou sistema de empresa indisponível.");
=======
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
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
			return vo;
		}
	}

<<<<<<< HEAD
	public ResponseUserVO findUserByCpf(Long cpf) {
		ResponseUserVO vo = new ResponseUserVO();
		try {
			User user = userRepository.findUserByCpf(cpf);
			if (user == null && user.getCpf() != null && user.getCpfPartner() != null) {
				vo.setMsg("CPF inválido.");
				return vo;
			}
			UserVO temp2 = new UserVO();
			ResponsePartnerVO partner = new ResponsePartnerVO();
			if (user.getCpfPartner() != null) {
				partner = this.findPartner(user.getCpfPartner());
				temp2.setPartner(partner.getPartnerVO());
			}
			temp2.setCpf(user.getCpf());
			temp2.setName(user.getName());
			temp2.setLastName(user.getLastName());
			vo.setUsersVO(new ArrayList<UserVO>());
			vo.getUsersVO().add(temp2);

		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde.");
=======
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
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
		}
		return vo;
	}

<<<<<<< HEAD
	public ResponseUserVO findAll() {
		ResponseUserVO vo = new ResponseUserVO();
		try {
			List<User> temp = userRepository.findAll();
			vo.setUsersVO(new ArrayList<UserVO>());
			for (User user : temp) {
//				Company company = this.findCompany(user.getCnpj());
				ResponsePartnerVO partner = new ResponsePartnerVO();
				UserVO temp2 = new UserVO();
				if (user.getCpfPartner() != null) {
					partner = this.findPartner(user.getCpfPartner());
					temp2.setPartner(partner.getPartnerVO());
				}
//				temp2.setCompany(company);
				temp2.setCpf(user.getCpf());
				temp2.setName(user.getName());
				temp2.setLastName(user.getLastName());
				vo.getUsersVO().add(temp2);
			}
=======
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
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde.");
		}

		return vo;
<<<<<<< HEAD
	}

	public ResponseUserVO findByCnpj(Long cnpj) {
		ResponseUserVO vo = new ResponseUserVO();
		try {
			List<User> temp = userRepository.findByCnpj(cnpj);
			vo.setUsersVO(new ArrayList<UserVO>());
			for (User user : temp) {
//				Company company = this.findCompany(user.getCnpj());
				ResponsePartnerVO partner = new ResponsePartnerVO();
				UserVO temp2 = new UserVO();
				if (user.getCpfPartner() != null) {
					partner = this.findPartner(user.getCpfPartner());
					temp2.setPartner(partner.getPartnerVO());
				}
//				temp2.setCompany(company);
				temp2.setCpf(user.getCpf());
				temp2.setName(user.getName());
				temp2.setLastName(user.getLastName());
				vo.getUsersVO().add(temp2);
			}
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde.");
		}

		return vo;
	}

	public ResponseUserVO getUserWithCompany(Long cpf) {
		ResponseUserVO vo = new ResponseUserVO();
		try {
			User user = userRepository.findUserByCpf(cpf);
			ResponseCompanyVO company = this.findCompany(user.getCnpj());
			if (company != null && company.getCompany() != null) {
				vo.setMsg("Sistema de empresa indisponível.");
				return vo;
			}
			UserVO temp2 = new UserVO();
//			temp2.setCompany(company);
			ResponsePartnerVO partner = new ResponsePartnerVO();
			partner = this.findPartner(user.getCpfPartner());
			temp2.setPartner(partner.getPartnerVO());
			temp2.setCpf(user.getCpf());
			temp2.setName(user.getName());
			temp2.setLastName(user.getLastName());
			vo.getUsersVO().add(temp2);
=======
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
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde.");
		}

		return vo;
	}

<<<<<<< HEAD
//	public ResponseUserVO getUserWithPartner(Long cpf) {
//		ResponseUserVO vo = new ResponseUserVO();
=======
//	public ResponseTemplateVO getUserWithPartner(Long cpf) {
//		ResponseTemplateVO vo = new ResponseTemplateVO();
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
//		User user = userRepository.findUserByCpf(cpf);
//
//		Partner partner = restTemplate.getForObject("http://localhost:9007/partners/" + user.getCpfPartner(),
//				Partner.class);
<<<<<<< HEAD
//		vo.setUsersVO(user);
=======
//		vo.setUser(user);
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
//		vo.setPartner(partner);
//		return vo;
//	}

<<<<<<< HEAD
	private ResponseCompanyVO findCompany(Long cnpj) {
		ResponseCompanyVO company = new ResponseCompanyVO();
		try {
			company = restTemplate.getForObject("http://localhost:9092/companies/" + cnpj, ResponseCompanyVO.class);
		} catch (Exception e) {
			company.setMsg("Sistema de empresa indisponível.");
		}
		return company;
	}

	private ResponsePartnerVO findPartner(Long cpfPartner) {
		ResponsePartnerVO partner = new ResponsePartnerVO();
		try {
			partner = restTemplate.getForObject("http://localhost:9007/partners/" + cpfPartner,
					ResponsePartnerVO.class);
		} catch (Exception e) {
			partner.setMsg("Sistema de dependentes indisponível.");
		}
=======
	private Company findCompany(Long cnpj) {
		Company company = restTemplate.getForObject("http://localhost:9092/companies/" + cnpj, Company.class);
		return company;
	}

	private Partner findPartner(Long cpfPartner) {
		Partner partner = restTemplate.getForObject("http://localhost:9007/partners/" + cpfPartner, Partner.class);
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
		return partner;
	}

}
