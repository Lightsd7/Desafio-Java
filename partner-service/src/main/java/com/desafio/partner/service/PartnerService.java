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
		return partnerRepository.save(partner);
	}

	public Partner findPartnerByCpfPartner(Long cpfPartner) {
		return partnerRepository.findPartnerByCpfPartner(cpfPartner);
	}
	
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
}
