package com.noorteck.java.day32;

//Child Class
public class Lenova extends Laptop {

	String city = "Reston";
	char gender = 'f';

	@Override
	public void price() {
		System.out.println("2000.00");
	}

	public void setColor() {
		System.out.println("Color: Orange...");

	}
}
