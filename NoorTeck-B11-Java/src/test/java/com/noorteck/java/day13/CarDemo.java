package com.noorteck.java.day13;

public class CarDemo {
	public static void main(String args[]) {
		
	Car c1= new Car();
	c1.year=2020;
	c1.model="BMW";
	System.out.println(c1.year);
	System.out.println(c1.model);
	
	c1.setColor("Black");
	c1.setPrice(2200.00);
	
	
	}

}
