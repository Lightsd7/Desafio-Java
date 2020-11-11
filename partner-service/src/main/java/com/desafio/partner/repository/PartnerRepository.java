package com.desafio.partner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.desafio.partner.entity.Partner;

@Repository
public interface PartnerRepository extends JpaRepository<Partner, Long> {

	Partner findPartnerByCpfPartner(Long cpfPartner);
}
