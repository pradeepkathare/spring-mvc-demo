package com.springmvc.customannotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>  {

	String courseDetail;
	
	@Override
	public void initialize(CourseCode constraintAnnotation) {
		// TODO Auto-generated method stub
		courseDetail = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String customerInputInHtml, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		boolean result = false;
		if(customerInputInHtml != null) {
			result = customerInputInHtml.startsWith(courseDetail);
		}
		return result;
	}

}
