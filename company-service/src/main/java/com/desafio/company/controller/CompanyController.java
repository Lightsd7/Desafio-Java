package com.desafio.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.http.ResponseEntity;
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.company.VO.ResponseTemplateVO;
import com.desafio.company.entity.Company;
<<<<<<< HEAD
import com.desafio.company.response.Response;
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee
import com.desafio.company.service.CompanyService;

@RestController
@RequestMapping("/companies")
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@PostMapping("/")
	public Company saveCompany(@RequestBody Company company) {
		return companyService.saveCompany(company);
	}

	@GetMapping()
	public List<Company> findAll() {
		return companyService.findAll();
	}

	@GetMapping("/{cnpj}")
	public Company findCompanyByCnpj(@PathVariable Long cnpj) {
		return companyService.findCompanyByCnpj(cnpj);
	}
<<<<<<< HEAD
	
//	@GetMapping("/{cnpj}")
//	public ResponseEntity<Response<Company>> findCompanyByCnpj(@PathVariable Long cnpj) {
//		return companyService.findCompanyByCnpj(cnpj);
//	}
=======
>>>>>>> 3999983d423d04a0e9c11ec007bdeef819ca01ee

	@GetMapping("/cnpj/{cnpj}")
	public ResponseTemplateVO getCompanyWithUser(@PathVariable("cnpj") Long cnpj) {
		return companyService.getCompanyWithUser(cnpj);
	}
}
