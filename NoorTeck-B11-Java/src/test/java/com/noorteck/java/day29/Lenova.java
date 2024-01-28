package com.noorteck.java.day29;

//Child Class
public class Lenova extends Laptop {
	// Instance Variable
	double price = 500.00;

	public void getPrice() {
		System.out.println("Child Class: Price:  " + price);
		System.out.println("Parent Class: Price:  " + super.price);
	}

	// Child Method
	public void color() {
		System.out.println("Grey");
	}

	public void getColor() {
		// Calling the child method
		color();
		// Calling the parent method
		super.color();
	}
}
/**
If both Parent & Child Class has variable with the SAME NAME	
	then to refer to the PARENT variable we will use Super keyword		
		super keyword is used to refer to the iMMEDIATE PARENT 

*/