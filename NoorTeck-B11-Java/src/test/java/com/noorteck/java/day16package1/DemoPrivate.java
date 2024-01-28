package com.noorteck.java.day16package1;

public class DemoPrivate {

	// Instance variable with PRIVATE access modifier
	private int age = 10;

	// Static variable with PRIVATE access modifier
	private static int favNum = 11;

	// Static method with PRIVATE access modifier
	private static void add(int a, int b) {
		System.out.println(a + b);
	}

	// Non-Static method with PRIVATE access modifier
	private void subtract(int a, int b) {
		System.out.println(a - b);
	}

}
