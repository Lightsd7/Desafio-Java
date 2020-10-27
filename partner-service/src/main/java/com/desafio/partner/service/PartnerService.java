package com.desafio.partner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafio.partner.VO.ResponseTemplateVO;
import com.desafio.partner.VO.User;
import com.desafio.partner.entity.Partner;
import com.desafio.partner.repository.PartnerRepository;

@Service
public class PartnerService {

	@Autowired
	private PartnerRepository partnerRepository;

	@Autowired
	private RestTemplate restTemplate;

	public Partner savePartner(Partner partner) {
<<<<<<< HEAD
//		User user = findUser(partner.getCpf());
		if (partnerRepository.findPartnerByCpfPartner(partner.getCpfPartner()) == null) {
			if (findUser(partner.getCpf()) != null) {
				return partnerRepository.save(partner);
			} else {
				return new Partner("Não existe usuário com o CPF: " + partner.getCpf());
			}
		}
		return new Partner("Cônjuge com CPF: " + partner.getCpfPartner() + " já foi cadastrado.");
//		User user = this.findUser(partner.getCpf());
//		if (user.getCpf() != null) {
//			if(partnerRepository.findPartnerByCpfPartner(partner.getCpfPartner()) != null) {
//				return new Partner("Cônjuge já existe.");
//			}
//			return partnerRepository.save(partner);
//		} else {
//			return new Partner("Não foi possível cadastrar cônjuge, pois CPF de usuário é inexistente.");
//		}
//		return partnerRepository.save(partner);
	}

	public Partner findPartnerByCpfPartner(Long cpfPartner) {
		Partner temp;
		try {
			 temp =	partnerRepository.findPartnerByCpfPartner(cpfPartner);
		} catch (Exception e) {
			temp = new Partner();
		}
		return temp;
	}

=======
		return partnerRepository.save(partner);
	}

	public Partner findPartnerByCpfPartner(Long cpfPartner) {
		return partnerRepository.findPartnerByCpfPartner(cpfPartner);
	}
	
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
	public List<Partner> findAll() {
		return partnerRepository.findAll();
	}

	public ResponseTemplateVO getPartnerWithUser(Long cpfPartner) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Partner partner = partnerRepository.findPartnerByCpfPartner(cpfPartner);

		User user = restTemplate.getForObject("http://localhost:9001/users/" + partner.getCpf(), User.class);
		vo.setPartner(partner);
		vo.setUser(user);
		return vo;
	}
<<<<<<< HEAD

	private User findUser(Long cpf) {
		User user = restTemplate.getForObject("http://localhost:9001/users/cpf/" + cpf, User.class);
		return user;
	}
=======
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
}
