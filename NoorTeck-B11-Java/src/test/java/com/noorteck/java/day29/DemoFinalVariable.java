package com.noorteck.java.day29;

public class DemoFinalVariable {
	
	//Instance Variable
	String country = "USA";
	
	//Static variable
	static String city = "Reston";
	
	//Instance Final Variable
	final String sport = "Soccer";
	
	//Static final Variable
	static final String gradeLevel = "Freshman";

	
	public static void main(String[]args) {
		
		//Instance variable has to create an object
		DemoFinalVariable obj = new DemoFinalVariable();
		
		//re-assigned new value over and over
		obj.country = "USA";
		obj.country = "Mexico";
		obj.country = "Englsnd";
		
		
		
		
		
	}
	
	

}
