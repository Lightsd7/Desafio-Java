package com.desafio.partner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafio.partner.VO.PartnerVO;
import com.desafio.partner.VO.ResponsePartnerVO;
import com.desafio.partner.VO.ResponseUserVO;
import com.desafio.partner.entity.Partner;
import com.desafio.partner.repository.PartnerRepository;

@Service
public class PartnerService {

	@Autowired
	private PartnerRepository partnerRepository;

	@Autowired
	private RestTemplate restTemplate;

	public ResponsePartnerVO savePartner(Partner partner) {
		ResponsePartnerVO vo = new ResponsePartnerVO();
		if (partnerRepository.findPartnerByCpfPartner(partner.getCpfPartner()) != null) {
			vo.setMsg("Dependente já existe");
			return vo;
		}
		ResponseUserVO userVO = new ResponseUserVO();
		userVO = this.findUser(partner.getCpfPartner());
		if (userVO != null && userVO.getUsersVO() != null && userVO.getUsersVO().size() > 0) {
			vo.setMsg("CPF de dependente é o mesmo que do funcionário cadastrado.");
			return vo;
		}
		ResponseUserVO temp = new ResponseUserVO();
		temp = this.findUser(partner.getCpf());
		if (temp != null && temp.getUsersVO() != null) {
			vo.setMsg("Esse CPF já possui dependente.");
			return vo;
		}
		partner = partnerRepository.save(partner);
		PartnerVO temp2 = new PartnerVO();
		temp2.setCpfPartner(partner.getCpfPartner());
		temp2.setName(partner.getName());
		temp2.setLastName(partner.getLastName());
		vo.setPartnerVO(temp2);
		return vo;
	}

	public ResponsePartnerVO findPartnerByCpfPartner(Long cpfPartner) {
		ResponsePartnerVO vo = new ResponsePartnerVO();
		try {
			Partner partner = partnerRepository.findPartnerByCpfPartner(cpfPartner);
			if (partner == null) {
				vo.setMsg("CPF cônjuge inválido.");
				return vo;
			}
			PartnerVO temp2 = new PartnerVO();
			temp2.setCpfPartner(partner.getCpfPartner());
			temp2.setName(partner.getName());
			temp2.setLastName(partner.getLastName());
			vo.setPartnerVO(temp2);
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde.");
		}
		return vo;
	}

	public ResponsePartnerVO findAll() {
		ResponsePartnerVO vo = new ResponsePartnerVO();
		try {
			List<Partner> temp = partnerRepository.findAll();
			for (Partner partner : temp) {
				PartnerVO temp2 = new PartnerVO();
				temp2.setCpfPartner(partner.getCpfPartner());
				temp2.setName(partner.getName());
				temp2.setLastName(partner.getLastName());
				vo.setPartnerVO(temp2);
			}
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde.");
		}
		return vo;

	}

	public ResponsePartnerVO getPartnerWithUser(Long cpfPartner) {
		ResponsePartnerVO vo = new ResponsePartnerVO();
		try {
			Partner partner = partnerRepository.findPartnerByCpfPartner(cpfPartner);
			ResponseUserVO user = this.findUser(partner.getCpf());
			PartnerVO temp2 = new PartnerVO();
			temp2.setCpfPartner(partner.getCpfPartner());
			temp2.setName(partner.getName());
			temp2.setLastName(partner.getLastName());
			vo.setPartnerVO(temp2);
		} catch (Exception e) {
			vo.setMsg("Sistema indisponível, tente mais tarde.");
		}
		return vo;
	}

	private ResponseUserVO findUser(Long cpf) {
		ResponseUserVO user = new ResponseUserVO();
		try {
			user = restTemplate.getForObject("http://localhost:9001/users/cpf/" + cpf, ResponseUserVO.class);
		} catch (Exception e) {
			user.setMsg("Sistema de cliente indisponível.");
		}
		return user;
	}
}
