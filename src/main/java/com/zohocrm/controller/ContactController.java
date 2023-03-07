package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Billing;
import com.zohocrm.entity.Contact;
import com.zohocrm.services.BillingService;
import com.zohocrm.services.ContactService;

@Controller
public class ContactController {

	@Autowired 
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	// http:localhost:8080/listcontacts
	@RequestMapping("/listcontacts")
	public String listContacts(ModelMap model) {
		List<Contact> contacts = contactService.getContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
	}
	
	
	@RequestMapping("/createBill")
	public String createBill(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.getContactById(id);
		model.addAttribute("contact", contact);
		
		return "generate_bill";
	}
	
	
	@RequestMapping("/saveBill")  // Creating Billing class saves as giving @RequestParam for every parameter not so good
	public String saveBill(Billing bill) {
		
		billingService.generateBill(bill);
		return "list_bill";
	}
	
}
