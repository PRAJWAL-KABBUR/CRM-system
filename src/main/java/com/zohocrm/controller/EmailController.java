package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.util.EmailService;


@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping(value ="/composeEmail", method=RequestMethod.POST)
// 	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("email") String emailId,ModelMap model) {
		// "email" must match with Entity class property and emailId is local variable 
		
		model.addAttribute("email", emailId);
		return "compose_email";
	}
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("to") String to,@RequestParam("sub") String sub,@RequestParam("msg") String msg, ModelMap model) {
		
		emailService.sendEmail(to, sub, msg);
		model.addAttribute("message", "Email Saved...!!");
		return "compose_email";
	}
}
