package com.desafio.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafio.user.VO.Company;
import com.desafio.user.VO.ResponseCompanyVO;
import com.desafio.user.VO.ResponsePartnerVO;
import com.desafio.user.VO.ResponseUserVO;
import com.desafio.user.VO.UserVO;
import com.desafio.user.entity.User;
import com.desafio.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

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
			return vo;
		}
	}

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
		}
		return vo;
	}

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
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde.");
		}

		return vo;
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
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde.");
		}

		return vo;
	}

//	public ResponseUserVO getUserWithPartner(Long cpf) {
//		ResponseUserVO vo = new ResponseUserVO();
//		User user = userRepository.findUserByCpf(cpf);
//
//		Partner partner = restTemplate.getForObject("http://localhost:9007/partners/" + user.getCpfPartner(),
//				Partner.class);
//		vo.setUsersVO(user);
//		vo.setPartner(partner);
//		return vo;
//	}

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
		return partner;
	}

}
