package com.noorteck.java.day34;

public interface Calculator {

	private static void add(int a, int b) {
		System.out.println(a + b);
	}

	private void substract(int a, int b, int c) {
		System.out.println(a - b - c);
	}
}
/**
 * Java 1.9, Interface introduced 2 more methods:
 * 
 * Method 1: private static method Method 2: private non-static method
 * 
 * 
 * WHY private???? because it wants to keep it within the interface
 * 
 * 
 */
