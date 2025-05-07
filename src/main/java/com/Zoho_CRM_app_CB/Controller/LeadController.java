package com.Zoho_CRM_app_CB.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Zoho_CRM_app_CB.Entity.Lead;
import com.Zoho_CRM_app_CB.Services.LeadServices;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/zohocrm")
public class LeadController {
	@Autowired
	private LeadServices leadserv;
	
	@GetMapping("/show")
	public String show() {
		
		return "show1";
	}
	
	@PostMapping("/savedata")
	public String savedata(Lead lead) {
		leadserv.saveLeadData(lead);
		//ResponseEntity.ok( "Your Data is Stored");
		return "show1";
		
	}
	
			
			
			
	@GetMapping("/listdata")
	public String listAllData(Lead lead, Model model) {
	    List<Lead> listdata = leadserv.listAllInfo(lead);
	    model.addAttribute("listdata", listdata); // Pass to JSP
	    return "showdata";
	}
	@GetMapping("/delete")
	public String Delete(@RequestParam("id")long id) {
		leadserv.deleteById(id);
		
		return "redirect:/zohocrm/listdata";
	}
	@GetMapping("/update")
	public String update(@RequestParam("id")long id,Model model) {
		
		Lead lead=leadserv.updatebyid(id);
		model.addAttribute("lead",lead);
		
		return "update_data";
	}
	@PostMapping("/updatedata")
public String updatedata(Lead lead) {
	leadserv.updatedata(lead);
	return "redirect:/zohocrm/listdata";
}

//	
//	@PostMapping("/Rawsavedata")
//	public String savedataRaw(@RequestParam(defaultValue = "First")String fname,
//			@RequestParam(defaultValue="Last")String lname,
//			@RequestParam(defaultValue="email")String email,
//			@RequestParam(defaultValue="mobile")long mobile
//			
//			
//			){
//		Lead lead=new Lead();
//		lead.setFname(fname);
//		
//		//ResponseEntity.ok( "Your Data is Stored");
//		return "show";
//		
//	}
}
