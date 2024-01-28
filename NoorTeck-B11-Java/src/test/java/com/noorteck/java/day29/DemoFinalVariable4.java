package com.noorteck.java.day29;

public class DemoFinalVariable4 {
	public static void main(String[] args) {

		// Local variable
		int count = 10;
		count = 11;
		count = 12;
		count = 13;
		final int AGE = 11;

	}

}
/**
 * Instance Variable         --> Yes, it can be FINAL
 * 
 * Static Variable           --> Yes, it can be FINAL
 * 
 * Local Variable/Parameters --> Yes, it can be FINAL
 * 
 * 
 * REMINDER: Local Variable/Parameters CANNOT be static
 * 
 */