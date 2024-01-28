package com.noorteck.java.day27;

public class Car {

	private String make;
	private String model;
	private int year;
	private int speed;

	public Car(String make, String model, int year, int speed) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.speed = speed;
	}

	// implementing setter
	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setyear(int year) {
		this.year = year;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// implementing getter
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public int getSpeed() {
		return speed;
	}

	// method accelerating
	public void accelerate() {
		speed = speed + 10;
	}

    // method decelerating
	public void decelerate() {
		speed = speed - 10;
	}
	public void getCarInfo() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		
	}
}
