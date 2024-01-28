package com.noorteck.java.day29;

public class State extends Country {
	//Constructor that take 3 parameters
	public State(int population, String city,boolean isCold) {
		super("USA","DC");
		System.out.println("State Class Constructor");
		System.out.println(population);
		System.out.println(isCold);
		System.out.println("--------------------");

}
}
