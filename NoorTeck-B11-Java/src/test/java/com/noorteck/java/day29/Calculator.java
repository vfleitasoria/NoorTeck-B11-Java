package com.noorteck.java.day29;

public class Calculator {

	// Instance Variable
	String name;
	int level;
	//Constructor
	public Calculator(String name, int level) {
		/**
		 * Our parameter name is same as the INSTANCE VARIABLE name
		 * to differentiate between instance & parameter name when they have same NAME then we use 'this' keyword
		 */
		this.name = name;
		this.level = level;
	}
		
		//Non static method
		 public void display(String name, int level, boolean total) {
			 
			 
			 System.out.println(name);
			 
			 
			 
			 System.out.println(this.name);
			 
		 }
	}

