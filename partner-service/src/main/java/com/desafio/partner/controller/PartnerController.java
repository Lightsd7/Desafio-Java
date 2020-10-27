package com.desafio.partner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.partner.VO.ResponseTemplateVO;
import com.desafio.partner.entity.Partner;
import com.desafio.partner.service.PartnerService;

@RestController
@RequestMapping("/partners")
public class PartnerController {

	@Autowired
	private PartnerService partnerService;

	@PostMapping("/")
	public Partner savePartner(@RequestBody Partner partner) {
		return partnerService.savePartner(partner);
	}

	@GetMapping()
	public List<Partner> findAll() {
		return partnerService.findAll();
	}

	@GetMapping("/{cpfPartner}")
	public Partner findPartnerByCpfPartner(@PathVariable("cpfPartner") Long cpfPartner) {
		return partnerService.findPartnerByCpfPartner(cpfPartner);
	}
	
	@GetMapping("/users/{cpfPartner}")
	public ResponseTemplateVO getPartnerWithUser(@PathVariable("cpfPartner") Long cpfPartner) {
		return partnerService.getPartnerWithUser(cpfPartner);
	}
	
}
