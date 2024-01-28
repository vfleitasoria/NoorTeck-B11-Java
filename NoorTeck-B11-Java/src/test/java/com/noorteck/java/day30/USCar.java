package com.noorteck.java.day30;

public class USCar {

	private String make;
	private String model;
	private int year;
	private String color;

	public USCar(String make) {
		this.make = make;
		model = "N/A";
		color = "N/A";
		year = 2024;

	}

	public USCar(String make, String model) {
		this.make = make;
		this.model = model;
		color = "N/A";
		year = 2024;

	}

	public USCar(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
		color = "N/A";

	}

	public USCar(String make, String model, int year, String color) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;

	}

	public void getInfo() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Color: " + color);
		System.out.println("********");

	}

	public static void main(String[] args) {

		USCar obj1 = new USCar("Honda");
		USCar obj2 = new USCar("Toyota", "Camry");
		USCar obj3 = new USCar("Tesla", "CiberTruck", 2024);
		USCar obj4 = new USCar("Benz", "XY", 2020, "Black");

		obj1.getInfo();
		obj2.getInfo();
		obj3.getInfo();
		obj4.getInfo();

	}
}
