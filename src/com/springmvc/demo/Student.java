package com.springmvc.demo;

import java.util.LinkedHashMap;

/*
 * Pradeep.kathare
 */

public class Student {

	public String firstName;
	public String lastName;
	public String country;
	public String faviorateLanguage;
	public LinkedHashMap< String, String> checkboxes;
	
	public LinkedHashMap< String, String> countries;
	
	public String []checkboxValues; 
	public String contry;

	Student() {
		countries = new LinkedHashMap<String, String>();
		countries.put("KA", "A");
		countries.put("MH", "B");
		countries.put("SI", "C");
		countries.put("TI", "D");
		countries.put("MI", "E");
		countries.put("KAA", "F");

		checkboxes = new LinkedHashMap<String, String>();
		checkboxes.put("JAVA", "JAVA");
		checkboxes.put("AVA", "AVA");
		checkboxes.put("VA", "VA");
		checkboxes.put("A", "A");

	}

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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}

	public void setCountries(LinkedHashMap<String, String> countries) {
		this.countries = countries;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	public String getFaviorateLanguage() {
		return faviorateLanguage;
	}

	public void setFaviorateLanguage(String faviorateLanguage) {
		this.faviorateLanguage = faviorateLanguage;
	}

	public String[] getCheckboxValues() {
		return checkboxValues;
	}

	public void setCheckboxValues(String[] checkboxValues) {
		this.checkboxValues = checkboxValues;
	}

	public LinkedHashMap<String, String> getCheckboxes() {
		return checkboxes;
	}
	
	
	
	
}
