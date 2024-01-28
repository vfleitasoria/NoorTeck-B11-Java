package com.noorteck.java.day36;

public class DemoWrapper {
	public static void main(String[]args) {
		//create a variable of int and assign value
		int age = 11;//primitive data type---> the value is stored in stack memory
		//create an object of integer
		
		Integer count = 12;//non primitive data type---> the value is stored in heap memory
		Integer favNum = new Integer (33);//non primitive data type---> the value is stored in heap memory
		
		System.out.println(age);
		System.out.println(count);
		System.out.println(favNum);
		
	}

}
