package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Contact;
import com.zohocrm.entity.Lead;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	
	
	@Autowired
	private ContactService contactService;
	
	
	// http:localhost:8080/createLead
	@RequestMapping(value="/createLead", method=RequestMethod.GET) 
//	@RequestMapping("/createLead")     // GET method because its been calling from URL 
	public String viewCreateLeadForm(Lead lead) {
		return "create_lead";
	}
	
	
	@RequestMapping(value = "/saveLead", method = RequestMethod.POST)
//  @RequestMapping("/saveLead")  is also valid
	public String saveLead(@ModelAttribute("lead")Lead lead, ModelMap model) {
		
		leadService.saveOneLead(lead);
		model.addAttribute("leads", lead);
		return "lead_info";   // To display the saved content it moved to next jsp page
	}
	
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id) {
		
		Lead lead = leadService.getLeadById(id);
		
		
		Contact contact = new Contact();
		// Copying data from Lead to Contact
		
		contact.setFirstName(lead.getFirstName()); 
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactService.saveContact(contact);
		
		// Delete the copied record from Lead table
		leadService.deleteLeadById(id);
		
		return "";
		
	}
	
	
		@RequestMapping("/listleads")
		public String listLeads(ModelMap model) {
			List<Lead> lead = leadService.getAllLeads();
			model.addAttribute("leads", lead);
			return "list_leads";
		} 
		
		@RequestMapping("/leadInformation")
		public String leadInfo(@RequestParam("id") long id, ModelMap model) {
			
			Lead lead = leadService.getLeadById(id);
			model.addAttribute("leads", lead);
			return "lead_info";
			
		}
		
	
	}
	

