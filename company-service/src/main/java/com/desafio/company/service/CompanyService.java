package com.desafio.company.service;

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

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	@Autowired
	private RestTemplate restTemplate;

	public Company saveCompany(Company company) {
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

=======

	public Company findCompanyByCnpj(Long cnpj) {
		return companyRepository.findCompanyByCnpj(cnpj);
	}

>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
	public List<Company> findAll() {
		return companyRepository.findAll();
	}

	public ResponseTemplateVO getCompanyWithUser(Long cnpj) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
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

}
