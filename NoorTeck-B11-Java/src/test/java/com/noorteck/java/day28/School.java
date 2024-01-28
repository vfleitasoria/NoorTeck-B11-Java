package com.noorteck.java.day28;

public class School {
	public int id; //instance variable

	public static char gender; //static variable

	
	//non-static method
	public void getData() {
		//call id variable and set value 123
		
		id = 123;
		
		//call gender variable and set value f
		gender = 'f';
	}

	
	
	//static method
	public static void getInfo() {
		//call id variable and set value 456
		
		School obj = new School();
		obj.id = 456;
		
		//call gender variable and set value m
		gender = 'm';
	}

}