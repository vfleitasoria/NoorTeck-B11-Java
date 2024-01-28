package com.noorteck.java.day13;

public class Employee {
	
	// Instance variable
	String firstName;
	int id;
	String country;
	char gender;
	
	public static void main(String args[]) {
		
		Employee obj = new Employee();
		
		obj.firstName = "John";
		obj.id = 123;
		obj.country = "USA";
		obj.gender = 'M';
		
		// Print any instance variable
		
		System.out.println(obj.firstName);
		System.out.println(obj.id);
		System.out.println(obj.country);
		System.out.println(obj.gender);
		
		
		// To access to any instance variable we need to create class objectName, variable name
		//Print each instance variable
		
	}
	

}
/** 
    Instance variable:
       is declared inside the class but outside the method body*/