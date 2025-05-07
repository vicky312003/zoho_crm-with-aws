package com.Zoho_CRM_app_CB.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.Zoho_CRM_app_CB.Entity.Lead;
import com.Zoho_CRM_app_CB.Repository.LeadRepository;
@Service
public class LeadServicesImpl implements LeadServices{
	@Autowired
	private LeadRepository leadrepo;
	@Override
	public void saveLeadData(Lead lead) {
		leadrepo.save(lead);
		
	}
	public List<Lead> listAllInfo(Lead lead){
		List<Lead> listdata=leadrepo.findAll();
		return listdata;
	}
	@Override
	public void deleteById(long id) {
		leadrepo.deleteById(id);
		
	}
	@Override
	public Lead updatebyid(long id) {
		Optional<Lead> data=  leadrepo.findById(id);
		Lead leaddata=data.get();
		return leaddata;
	}
	@Override
	public void updatedata(Lead lead) {
		leadrepo.save(lead);
		
	}
	
	
		
	

}
