package com.springmvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * Pradeep.kathare
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	
	//create controller method for the calling the html form
	@RequestMapping("/showForm")
	public String showForm() {
		return "student-form";
	}
	
	//create the controller method for processing the form 
	@RequestMapping("/processForm")
	public String processForm() {
		return "process-form";
	}
	
	//create the new controller method for processing the form version2
	@RequestMapping("/processFormVersion")
	public String processFormVersion(HttpServletRequest request,Model model) {
		
	 //fetch the request parameter
		String studentName = request.getParameter("studentName");
	 //assign to the result
		String result = "YO !! " + studentName;
	//add to the model object
		model.addAttribute("studentNameResult", result);
	// return to the jsp page name
		return "process-form";
		
	}
	
	//below method to show how to use requestParam
	@RequestMapping("/processFormVersionThree")
	public String useRequestParam(@RequestParam("studentName")String theName,Model model) {
		
		//assign to the result
		String result = "Hey RequestParam : "+theName;
		//add to model object
		model.addAttribute("studentNameResult", result);
		//return the jsp file
		return "process-form";
	}
	
	
}
