package com.springmvc.demo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springmvc.customannotation.CourseCode;

public class Customer {

	private String firstName;
	@NotNull(message ="lastName cannot be null")
	@Size(min=1,message = "min length is 1 ")
	private String lastName;
	
	@NotNull(message ="freepass cannot be null")
	@Min(value=0,message="value should minimum 0")
	@Max(value=10,message="value should max of 10")
	private Integer freePass;
	
	@Pattern(message="Invalid code", regexp = "^[a-zA-Z0-9]{5}")
	private String postalCode;
	
	@CourseCode(value="TUV",message="Start with TUV")
	private String courseCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePass() {
		return freePass;
	}
	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	
}
