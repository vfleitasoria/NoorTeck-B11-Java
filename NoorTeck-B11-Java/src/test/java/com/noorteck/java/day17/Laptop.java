package com.noorteck.java.day17;

public class Laptop {

	// Instance Variable
	String model;
	int ram;
	double price;

	// Constructor
	public Laptop(String model, int ram, double price) {

		this.model = model;
		this.ram = ram;
		this.price = price;
	}

	public void display() {
		String model = "Lenovo";
		System.out.println("***" + this.model);// This will print the Instance Variable
		System.out.println("***" + model);// this will print the Local Variable

	}

	public static void main(String[] args) {

		Laptop obj = new Laptop("HP", 500, 22.22);

		System.out.println(obj.model);
		System.out.println(obj.ram);
		System.out.println(obj.price);

		obj.display();
	}
}
