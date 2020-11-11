package com.desafio.person.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafio.person.VO.Company;
import com.desafio.person.VO.Partner;
import com.desafio.person.VO.PartnerVO;
import com.desafio.person.VO.PersonVO;
import com.desafio.person.VO.ResponsePartnerVO;
import com.desafio.person.VO.ResponsePersonVO;
import com.desafio.person.entity.Pessoa;
import com.desafio.person.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private RestTemplate restTemplate;

	public ResponsePersonVO savePerson(Pessoa person) {
		ResponsePersonVO vo = new ResponsePersonVO();

		Company company = this.findCompany(person.getCnpj());
		if (company.getCnpj() != null) {
			if (personRepository.findPersonByCpf(person.getCpf()) != null) {
				vo.setMsg("Usuário já existe.");
				return vo;
			}
			if(person.getCpf() == person.getCpfPartner()) {
				vo.setMsg("CPF duplicado.");
				return vo;
			}
			if(personRepository.findPersonByCpf(person.getCpfPartner()) != null) {
				vo.setMsg("Cônjuge já cadastrado.");
				return vo;
			}
			person = personRepository.save(person);
			PersonVO temp = new PersonVO();
			temp.setCpf(person.getCpf());
			temp.setName(person.getName());
			temp.setLastName(person.getLastName());
			temp.setCompany(company);
			Partner partner = new Partner();
			temp.setPartner(partner);
			vo.setPersonsVO(new ArrayList<PersonVO>());
			vo.getPersonsVO().add(temp);
			return vo;
		} else {
			vo.setMsg("Não foi possível cadastrar usuário, pois CNPJ é inexistente.");
			return vo;
		}
	}

	public ResponsePersonVO findPessoaByCpf(Long cpf) {
		ResponsePersonVO vo = new ResponsePersonVO();
		try {
			Pessoa person = personRepository.findPessoaByCpf(cpf);
			if (person == null) {
				vo.setMsg("CPF inválido.");
				return vo;
			}
			PersonVO temp = new PersonVO();
			Company company = new Company();
			if (person.getCnpj() != null) {
				company = this.findCompany(person.getCnpj());
				temp.setCompany(company);
			}
			temp.setCpf(person.getCpf());
			temp.setName(person.getName());
			temp.setLastName(person.getLastName());
			vo.setPersonsVO(new ArrayList<PersonVO>());
			vo.getPersonsVO().add(temp);
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde.");
		}
		return vo;

	}

	public ResponsePersonVO findAll() {
		ResponsePersonVO vo = new ResponsePersonVO();
		try {
			List<Pessoa> temp = personRepository.findAll();
			vo.setPersonsVO(new ArrayList<PersonVO>());
			for (Pessoa person : temp) {
				PersonVO temp2 = new PersonVO();
				Company company = new Company();
				company = this.findCompany(person.getCnpj());
				temp2.setCpf(person.getCpf());
				temp2.setName(person.getName());
				temp2.setLastName(person.getLastName());
				temp2.setCompany(company);
				vo.getPersonsVO().add(temp2);
			}
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde.");
		}
		return vo;
	}

	public ResponsePartnerVO savePartner(Partner partner) {
		ResponsePartnerVO vo = new ResponsePartnerVO();
		try {
			if (personRepository.findPersonByCpf(partner.getCpfPartner()) != null) {
				vo.setMsg("CPF já cadastrado.");
				return vo;
			}
			partner = personRepository.save(partner);
			PartnerVO temp = new PartnerVO();
			temp.setCpf(partner.getCpfPartner());
			temp.setName(partner.getName());
			temp.setLastName(partner.getLastName());
			vo.getPartnerVO().add(temp);
			vo.setPartnerVO(new ArrayList<PartnerVO>());
			return vo;

		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde." + e);
		}
		return vo;
	}

	public ResponsePersonVO findByCnpj(Long cnpj) {
		ResponsePersonVO vo = new ResponsePersonVO();
		try {
			Company company = this.findCompany(cnpj);
			if (company.getCnpj() == null) {
				vo.setMsg("CNPJ inexistente.");
				return vo;
			}
			List<Pessoa> temp = personRepository.findByCnpj(cnpj);
			vo.setPersonsVO(new ArrayList<PersonVO>());
			for (Pessoa person : temp) {
				PersonVO temp2 = new PersonVO();
				temp2.setCpf(person.getCpf());
				temp2.setName(person.getName());
				temp2.setLastName(person.getLastName());
				vo.getPersonsVO().add(temp2);
			}
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde.");
		}
		return vo;
	}

	private Company findCompany(Long cnpj) {
		Company company = restTemplate.getForObject("http://localhost:9092/companies/" + cnpj, Company.class);
		return company;
	}

}
