package com.noorteck.java.day34;

public interface Laptop2 {
	
	public abstract void add();

	public static void substract() {
		System.out.println(2 - 1);
	}

	default void divide(int a, int b) {
		System.out.println(2 / 1);
	}
}



/**
Java 1. 8 Interface introduced 2 more methods

	  method 1: static method:
	  			IF the parent does not want the child to override 
	  			then the method will be static
	  	
	  method 2: default method
	  			IF the parent made it default then child has an option to override the default methods

NOTE: when working with default method ---> we have to mention default keyword

*/