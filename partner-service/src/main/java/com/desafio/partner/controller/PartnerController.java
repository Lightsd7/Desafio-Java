package com.desafio.partner.controller;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import com.desafio.partner.VO.ResponsePartnerVO;
=======
import com.desafio.partner.VO.ResponseTemplateVO;
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
import com.desafio.partner.entity.Partner;
import com.desafio.partner.service.PartnerService;

@RestController
@RequestMapping("/partners")
public class PartnerController {

	@Autowired
	private PartnerService partnerService;

	@PostMapping("/")
<<<<<<< HEAD
	public ResponsePartnerVO savePartner(@RequestBody Partner partner) {
=======
	public Partner savePartner(@RequestBody Partner partner) {
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
		return partnerService.savePartner(partner);
	}

	@GetMapping()
<<<<<<< HEAD
	public ResponsePartnerVO findAll() {
=======
	public List<Partner> findAll() {
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
		return partnerService.findAll();
	}

	@GetMapping("/{cpfPartner}")
<<<<<<< HEAD
	public ResponsePartnerVO findPartnerByCpfPartner(@PathVariable("cpfPartner") Long cpfPartner) {
=======
	public Partner findPartnerByCpfPartner(@PathVariable("cpfPartner") Long cpfPartner) {
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
		return partnerService.findPartnerByCpfPartner(cpfPartner);
	}
	
	@GetMapping("/users/{cpfPartner}")
<<<<<<< HEAD
	public ResponsePartnerVO getPartnerWithUser(@PathVariable("cpfPartner") Long cpfPartner) {
=======
	public ResponseTemplateVO getPartnerWithUser(@PathVariable("cpfPartner") Long cpfPartner) {
>>>>>>> a3a0321511786cbadd0905ea0bcad0659b79b7bb
		return partnerService.getPartnerWithUser(cpfPartner);
	}
	
}
