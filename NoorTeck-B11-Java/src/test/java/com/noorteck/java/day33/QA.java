package com.noorteck.java.day33;

//Abstract Class
public abstract class QA {
	// abstract method
	public abstract void add();

	// concrete method
	public void setID() {
		System.out.println("ID: 123");
	}

	// final method
	public final void address() {
		System.out.println("123 drive...");
	}

	// static method
	public static void city() {
		System.out.println("City: Resto");
	}

	// private method
	private void password() {
		System.out.println("Password: 123456");

	}

}
