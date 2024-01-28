package com.noorteck.java.day16package1;
//NOTE Class can not have protected access modifier
public class DemoProtected {
	
	//Static variable with protected modifier
	protected static int count = 11;
	
	//instance variable with protected modifier
	protected char gender='M';
	
	//Static method with protected modifier
	protected static void add(int a, int b) {
		System.out.println(a+b);
	}
	//Non-Static method with protected modifier
	protected void subtract(int a, int b) {
		System.out.println(a-b);
	}

}
