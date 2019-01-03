package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Pradeep.kathare
 * This class to show  how to conflicts occur on Requestmapping and how to avoid it.
 * If multiple controller has same requestMapping then while accessing will end-up it with error
 * To avoid it we can use requestmapping on class level as well 
 */
@Controller
@RequestMapping("/silly")
public class SillyController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "student-form";
	}
}
