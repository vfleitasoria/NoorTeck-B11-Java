package com.noorteck.java.day34;

//concrete class
public class Sport implements Football, Basketball, Soccer {

	// Provide implementation

	public void setCup() {
		System.out.println("Football");

	}

	public void setPlayOffs() {
		System.out.println("Basketball");

	}

	public void setWorldCup() {
		System.out.println("Soccer");

	}

}
