package com.desafio.company.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafio.company.VO.ResponseTemplateVO;
import com.desafio.company.VO.User;
import com.desafio.company.entity.Company;
import com.desafio.company.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	@Autowired
	private RestTemplate restTemplate;

	public Company saveCompany(Company company) {
		return companyRepository.save(company);
	}

	public Company findCompanyByCnpj(Long cnpj) {
		return companyRepository.findCompanyByCnpj(cnpj);
	}

	public List<Company> findAll() {
		return companyRepository.findAll();
	}

	public ResponseTemplateVO getCompanyWithUser(Long cnpj) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Company company = companyRepository.findCompanyByCnpj(cnpj);

		User[] temp = restTemplate.getForObject("http://localhost:9001/users/cnpj/" + company.getCnpj(), User[].class);
		vo.setUsers(Arrays.asList(temp));
		vo.setCompany(company);
		return vo;
	}

}
