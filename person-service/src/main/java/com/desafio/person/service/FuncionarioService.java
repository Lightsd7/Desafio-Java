package com.desafio.person.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafio.person.VO.Company;
import com.desafio.person.VO.FuncionarioVO;
import com.desafio.person.VO.Partner;
import com.desafio.person.VO.PersonVO;
import com.desafio.person.VO.ResponseFuncionarioVO;
import com.desafio.person.VO.ResponsePersonVO;
import com.desafio.person.entity.Funcionario;
import com.desafio.person.entity.Pessoa;
import com.desafio.person.repository.FuncionarioRepository;
import com.desafio.person.repository.PersonRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private PersonRepository pessoaRepository;

	@Autowired
	private RestTemplate restTemplate;

	public ResponseFuncionarioVO saveFuncionario(Funcionario funcionario) {
		ResponseFuncionarioVO vo = new ResponseFuncionarioVO();

		Company company = this.findCompany(funcionario.getCnpj());
		if (company.getCnpj() != null) {
			if (funcionarioRepository.findFuncionarioByCpf(funcionario.getPessoa().getCpf()) != null) {
				vo.setMsg("Usuário já existe.");
				return vo;
			}
			if (funcionario.getPessoa().getCpf() == funcionario.getConjuge().getCpf()) {
				vo.setMsg("CPF duplicado.");
				return vo;
			}
			if (funcionarioRepository.findFuncionarioByCpf(funcionario.getConjuge().getCpf()) != null) {
				vo.setMsg("Cônjuge já cadastrado.");
				return vo;
			}
			funcionario = funcionarioRepository.save(funcionario);
			FuncionarioVO temp = new FuncionarioVO();
			temp.setPessoa(funcionario);
			temp.setCnpj(company.getCnpj());
			temp.setConjuge();
			Partner partner = new Partner();
			temp.setPartner(partner);
			vo.setFuncionariosVO(new ArrayList<FuncionarioVO>());
			vo.getFuncionariosVO().add(temp);
			return vo;
		} else {
			vo.setMsg("Não foi possível cadastrar usuário, pois CNPJ é inexistente.");
			return vo;
		}
	}

	private Company findCompany(Long cnpj) {
		Company company = restTemplate.getForObject("http://localhost:9092/companies/" + cnpj, Company.class);
		return company;
	}

	public ResponseFuncionarioVO findFuncionarioByPessoa(Long cpf) {
		Pessoa pessoa = pessoaRepository.findPessoaByCpf(cpf);
		Funcionario funcionario = funcionarioRepository.findFuncionarioByPessoa(pessoa);
		ResponseFuncionarioVO vo = new ResponseFuncionarioVO();
		FuncionarioVO temp = new FuncionarioVO();
		temp.setCnpj(funcionario.getCnpj());
		temp.setConjuge(funcionario.getConjuge());
		temp.setPessoa(pessoa);
		vo.setFuncionariosVO(new ArrayList<FuncionarioVO>());
		vo.getFuncionariosVO().add(temp);
		return vo;
		
	}
}
