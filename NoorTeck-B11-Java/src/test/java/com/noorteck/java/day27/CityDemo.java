package com.noorteck.java.day27;

public class CityDemo {
	public static void main(String[]args) {

		City obj = new City();
		obj.setPopulation(123);
		System.out.println(obj.getPopulation());
		obj.setTemperature(22.22);
		System.out.println(obj.getTemperature());
		obj.setGrade('A');
		System.out.println(obj.getGrade());

	}

}
