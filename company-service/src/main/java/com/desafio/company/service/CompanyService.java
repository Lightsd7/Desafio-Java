package com.desafio.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafio.company.VO.CompanyVO;
import com.desafio.company.VO.ResponseCompanyVO;
import com.desafio.company.VO.ResponsePartnerVO;
import com.desafio.company.VO.ResponseUserVO;
import com.desafio.company.entity.Company;
import com.desafio.company.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	@Autowired
	private RestTemplate restTemplate;

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

	public List<Company> findAll() {
		return companyRepository.findAll();
	}

	public ResponseCompanyVO getCompanyWithUser(Long cnpj) {
		ResponseCompanyVO vo = new ResponseCompanyVO();
		try {
			Company company = companyRepository.findCompanyByCnpj(cnpj);
			ResponseUserVO temp = new ResponseUserVO();
			temp = this.findUserByCnpj(cnpj);
			if (temp.getMsg() != null) {
				vo.setMsg(temp.getMsg());
			}
			CompanyVO companyVO = new CompanyVO();
			companyVO.setCnpj(company.getCnpj());
			companyVO.setNomeFantasia(company.getNomeFantasia());
			companyVO.setRazaoSocial(company.getRazaoSocial());
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
}
