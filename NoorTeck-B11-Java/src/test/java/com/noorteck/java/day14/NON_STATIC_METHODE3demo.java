package com.noorteck.java.day14;

public class NON_STATIC_METHODE3demo {
	
//Non Static method
	public void getName() {
		//How to call Static variable from non static method body in different class
		NON_STATIC_METHOD3.name="John";
		System.out.println(NON_STATIC_METHOD3.name);
		
	}
}
