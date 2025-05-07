package com.Zoho_CRM_app_CB.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Zoho_CRM_app_CB.Entity.Lead;
import com.Zoho_CRM_app_CB.Repository.LeadRepository;


@RestController
@RequestMapping("/api")
public class Restcontroller {
	
	@Autowired
	private LeadRepository leadrepo;
	 
	@GetMapping("/listdata")
	public List<Lead> getAllLeadata(Lead lead){
			List<Lead> allleaddata=	leadrepo.findAll();
		return allleaddata;
	}
	
	@PostMapping("/savedata")
	public void saveLeadData(@RequestBody Lead lead) {
		leadrepo.save(lead);
	}	
	
	@PutMapping("/updatedata")
	public void updateLeadData(@RequestBody Lead lead)
	{
		leadrepo.save(lead);
	}
}

