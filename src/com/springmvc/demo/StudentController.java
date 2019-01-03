package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Spring Form Example
 */
@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {

		Student student = new Student();
		model.addAttribute("student", student);
		return "student-spring-mvc-form";
	}
	
	@RequestMapping("/processStudentSpringForm")
	public String processSpringForm(@ModelAttribute("student") Student student) {

		System.out.println("name : " + student.getFirstName());
		System.out.println("country :"+student.getCountry());
		//System.out.println("contry :"+student.get());
		System.out.println("checkbox : "+student.getCheckboxValues());

		return "student-confirmation";
	}
}
