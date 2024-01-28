package com.noorteck.java.day34;

public class State implements Country {

	public void population() {
System.out.println("Population: 123");
	}

	public void capital() {
		System.out.println("DC");
	}

	public void city() {
		System.out.println("Alexandria");
	}

	public int add(int a, int b) {
		int result = a + b;

		return result;

	}
}
