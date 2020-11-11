package com.desafio.company.service;

<<<<<<< HEAD
=======
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Arrays;
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafio.company.VO.CompanyVO;
<<<<<<< HEAD
import com.desafio.company.VO.ResponseCompanyVO;
import com.desafio.company.VO.ResponsePartnerVO;
import com.desafio.company.VO.ResponseUserVO;
import com.desafio.company.entity.Company;
import com.desafio.company.repository.CompanyRepository;
=======
import com.desafio.company.VO.Partner;
import com.desafio.company.VO.PartnerVO;
import com.desafio.company.VO.ResponseTemplateVO;
import com.desafio.company.VO.User;
import com.desafio.company.VO.UserVO;
import com.desafio.company.entity.Company;
import com.desafio.company.repository.CompanyRepository;
=======
import java.util.Arrays;
import java.util.List;
<<<<<<< HEAD
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
=======

import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafio.company.VO.ResponseTemplateVO;
import com.desafio.company.VO.User;
import com.desafio.company.entity.Company;
import com.desafio.company.repository.CompanyRepository;
<<<<<<< HEAD
import com.desafio.company.response.Response;
import com.desafio.company.service.exceptions.ObjectNotFoundException;
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	@Autowired
	private RestTemplate restTemplate;

<<<<<<< HEAD
	public ResponseCompanyVO saveCompany(Company company) {
		ResponseCompanyVO vo = new ResponseCompanyVO();
		if (companyRepository.findCompanyByCnpj(company.getCnpj()) != null) {
			vo.setMsg("Empresa já cadastrada.");
			return vo;
		}
		company = companyRepository.save(company);
		CompanyVO temp = new CompanyVO();
		temp.setCnpj(company.getCnpj());
		temp.setNomeFantasia(company.getNomeFantasia());
		temp.setRazaoSocial(company.getRazaoSocial());
		vo.setCompanyVO(temp);
		return vo;
	}

	public ResponseCompanyVO findCompanyByCnpj(Long cnpj) {
		ResponseCompanyVO vo = new ResponseCompanyVO();
		try {
			Company company = companyRepository.findCompanyByCnpj(cnpj);
			if (company == null) {
				vo.setMsg("CNPJ inválido.");
				return vo;
			}
			CompanyVO temp = new CompanyVO();
			temp.setCnpj(company.getCnpj());
			temp.setNomeFantasia(company.getNomeFantasia());
			temp.setRazaoSocial(company.getRazaoSocial());
			ResponseUserVO temp2 = new ResponseUserVO();
			temp2 = this.findUserByCnpj(cnpj);
			if (temp2.getMsg() != null) {
				vo.setMsg(temp2.getMsg());
			}
			vo.setCompanyVO(temp);
			vo.getCompanyVO().setUsersVO(temp2.getUsersVO());
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde.");
		}
		return vo;

	}

=======
	public Company saveCompany(Company company) {
<<<<<<< HEAD
		if (companyRepository.findCompanyByCnpj(company.getCnpj()) == null) {
			return companyRepository.save(company);
		} else {
			return new Company("CNPJ já existe.");
		}
	}

	public Company findCompanyByCnpj(Long cnpj) {
		Company company;
		try {
			company = companyRepository.findCompanyByCnpj(cnpj);
			if (company != null) {
				return company;
			} else {
				return new Company("CNPJ não encontrado: " + cnpj);
			}
		} catch (Exception e) {
			return new Company("CNPJ não encontrado: " + cnpj);
		}
		
=======
		return companyRepository.save(company);
	}
<<<<<<< HEAD
	
	public Company findCompanyByCnpj(Long cnpj) {
		Company company = companyRepository.findCompanyByCnpj(cnpj);
		if(company != null) {
			return company;
		}else {
			return new Company("CNPJ não encontrado: " + cnpj);
		}
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
	}

//	public Company findCompanyByCnpj(Long cnpj) {
//		Optional<Company> company = Optional.ofNullable(companyRepository.findCompanyByCnpj(cnpj));
//		return company.orElseThrow(() -> new ObjectNotFoundException(
//				"CNPJ não encontrado: " + cnpj + " Tipo: " + Company.class.getName()));
//
//	}

//	public ResponseEntity<Response<Company>> findCompanyByCnpj(Long cnpj) {
//		Response<Company> response = new Response<Company>();
//		Optional<Company> company = Optional.ofNullable(companyRepository.findCompanyByCnpj(cnpj));
//		if (!company.isPresent()) {
//			response.getErrors().add("CNPJ não encontrado");
//			return ResponseEntity.badRequest().body(response);
//		}
//		response.setData(saveCompany(company.get()));
//		return ResponseEntity.ok(response);
//	}

<<<<<<< HEAD
=======
=======

	public Company findCompanyByCnpj(Long cnpj) {
		return companyRepository.findCompanyByCnpj(cnpj);
	}

>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
	public List<Company> findAll() {
		return companyRepository.findAll();
	}

<<<<<<< HEAD
	public ResponseCompanyVO getCompanyWithUser(Long cnpj) {
		ResponseCompanyVO vo = new ResponseCompanyVO();
		try {
			Company company = companyRepository.findCompanyByCnpj(cnpj);
			ResponseUserVO temp = new ResponseUserVO();
			temp = this.findUserByCnpj(cnpj);
			if (temp.getMsg() != null) {
				vo.setMsg(temp.getMsg());
			}
=======
	public ResponseTemplateVO getCompanyWithUser(Long cnpj) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
<<<<<<< HEAD
		try {
			Company company = companyRepository.findCompanyByCnpj(cnpj);
			User[] temp = restTemplate.getForObject("http://localhost:9001/users/cnpj/" + company.getCnpj(),
					User[].class);
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
			CompanyVO companyVO = new CompanyVO();
			companyVO.setCnpj(company.getCnpj());
			companyVO.setNomeFantasia(company.getNomeFantasia());
			companyVO.setRazaoSocial(company.getRazaoSocial());
<<<<<<< HEAD
			companyVO.setUsersVO(temp.getUsersVO());
			vo.setCompanyVO(companyVO);
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde...");
		}
		return vo;
	}

	private ResponseUserVO findUserByCnpj(Long cnpj) {
		ResponseUserVO user = new ResponseUserVO();
		try {
			user = restTemplate.getForObject("http://localhost:9001/users/cnpj/" + cnpj, ResponseUserVO.class);
		} catch (Exception e) {
			user.setMsg("Sistema de funcionário indisponível.");
		}
		return user;
	}

	private ResponseUserVO findUser(Long cpf) {
		ResponseUserVO user = new ResponseUserVO();
		try {
			user = restTemplate.getForObject("http://localhost:9001/users/cpf/" + cpf, ResponseUserVO.class);
		} catch (Exception e) {
			user.setMsg("Sistema de funcionário indisponível.");
		}
		return user;
	}

	private ResponsePartnerVO findPartner(Long cpfPartner) {
		ResponsePartnerVO partner = new ResponsePartnerVO();
		try {
			partner = restTemplate.getForObject("http://localhost:9007/partners/" + cpfPartner,
					ResponsePartnerVO.class);
		} catch (Exception e) {
			partner.setMsg("Sistema de dependente indisponível.");
		}
		return partner;
	}
=======
			List<UserVO> usersVO = new ArrayList<UserVO>();
			for (User user : temp) {
				UserVO userVO = new UserVO();
				userVO.setCpf(user.getCpf());
				userVO.setName(user.getName());
				userVO.setLastName(user.getLastName());
				Partner temp2 = restTemplate.getForObject("http://localhost:9007/partners/" + user.getCpfPartner(),
						Partner.class);
				PartnerVO partnerVO = new PartnerVO();
				partnerVO.setCpfPartner(temp2.getCpfPartner());
				partnerVO.setName(temp2.getName());
				partnerVO.setLastName(temp2.getLastName());
				partnerVO.setIsMarried(temp2.getIsMarried());
				userVO.setPartnerVO(partnerVO);
				usersVO.add(userVO);
			}
			companyVO.setUsersVO(usersVO);
			vo.setCompanyVO(companyVO);
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde: " + e);
		}

		return vo;
	}

	private Partner findPartner(Long cpfPartner) {
		Partner partner = restTemplate.getForObject("http://localhost:9007/partners/" + cpfPartner, Partner.class);
		return partner;
	}
=======
<<<<<<< HEAD
		try {
			Company company = companyRepository.findCompanyByCnpj(cnpj);
			User[] temp = restTemplate.getForObject("http://localhost:9001/users/cnpj/" + company.getCnpj(), User[].class);
			vo.setUsers(Arrays.asList(temp));
			vo.setCompany(company);
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde.");
		}
		
=======
		Company company = companyRepository.findCompanyByCnpj(cnpj);

		User[] temp = restTemplate.getForObject("http://localhost:9001/users/cnpj/" + company.getCnpj(), User[].class);
		vo.setUsers(Arrays.asList(temp));
		vo.setCompany(company);
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
		return vo;
	}

>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
}
