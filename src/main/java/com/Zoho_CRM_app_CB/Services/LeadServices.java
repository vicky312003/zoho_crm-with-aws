package com.Zoho_CRM_app_CB.Services;



import java.util.List;




import com.Zoho_CRM_app_CB.Entity.Lead;


public interface LeadServices {
	
	public void saveLeadData(Lead lead);
	
	public List<Lead> listAllInfo(Lead lead);

	public void deleteById(long id);

	public Lead updatebyid(long id);

	public void updatedata(Lead lead);
	
	
		
	

}
