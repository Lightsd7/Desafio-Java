package com.desafio.partner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.partner.VO.ResponsePartnerVO;
import com.desafio.partner.entity.Partner;
import com.desafio.partner.service.PartnerService;

@RestController
@RequestMapping("/partners")
public class PartnerController {

	@Autowired
	private PartnerService partnerService;

	@PostMapping("/")
	public ResponsePartnerVO savePartner(@RequestBody Partner partner) {
		return partnerService.savePartner(partner);
	}

	@GetMapping()
	public ResponsePartnerVO findAll() {
		return partnerService.findAll();
	}

	@GetMapping("/{cpfPartner}")
	public ResponsePartnerVO findPartnerByCpfPartner(@PathVariable("cpfPartner") Long cpfPartner) {
		return partnerService.findPartnerByCpfPartner(cpfPartner);
	}
	
	@GetMapping("/users/{cpfPartner}")
	public ResponsePartnerVO getPartnerWithUser(@PathVariable("cpfPartner") Long cpfPartner) {
		return partnerService.getPartnerWithUser(cpfPartner);
	}
	
}
