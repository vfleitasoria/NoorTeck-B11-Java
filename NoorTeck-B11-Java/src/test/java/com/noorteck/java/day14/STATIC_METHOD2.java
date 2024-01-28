package com.noorteck.java.day14;

public class STATIC_METHOD2 {

// non static method
	public void getInfo() {
		System.out.println("Data...");
	}

	// static method
	public static void display() {

		STATIC_METHOD2 obj = new STATIC_METHOD2();
		obj.getInfo();

	}
}
/** create class first*/