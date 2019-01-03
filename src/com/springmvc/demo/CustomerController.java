package com.springmvc.demo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	
	//initbinder will be like preprocess
	//remove whitespace leading and trailing 
	@InitBinder
	public void preprocess(WebDataBinder databinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		model.addAttribute("customer", new Customer());
		return "customer-spring-mvc-form";
	}
	
	@RequestMapping("/processCustomerSpringForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer,BindingResult bindingresult) {
		
		System.out.println("Customer values : "+customer.getFirstName() +"last name : "+customer.getLastName()+"|");
		System.out.println("binding result  : "+bindingresult);
		if(bindingresult.hasErrors()) {
			return "customer-spring-mvc-form";
		}
		
		
		return "customer-confirm";
	}
	
}
