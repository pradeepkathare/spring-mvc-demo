package com.springmvc.test;

public class ConsecutiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "";
		StringBuilder output = new StringBuilder();
		char[] inputCharArr = input.toCharArray();
		int i =0;
		while(i<inputCharArr.length-1) {
			
			
			if(input.equals(output)) {
				System.out.println("output : "+output);
				return;
			}
			
			if((inputCharArr[i+1]-inputCharArr[i])!=1) {
				output.append(inputCharArr[i]);
				
			}else {
				i++;
			}
			
		}
	}

}
