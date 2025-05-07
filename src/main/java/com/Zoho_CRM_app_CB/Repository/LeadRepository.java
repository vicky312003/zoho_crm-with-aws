package com.Zoho_CRM_app_CB.Repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Zoho_CRM_app_CB.Entity.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead,Long> {
	Lead findByEmail(String email);
}
