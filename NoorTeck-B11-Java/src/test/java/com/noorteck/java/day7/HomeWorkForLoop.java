package com.noorteck.java.day7;

public class HomeWorkForLoop {
	public static void main(String args[]) {

		// FROM YOUTUBE VIDEO FOR LOOPS INCREMENTS AND DECREMENT (POST AND PRE)
		int n = 5;

		System.out.println(n);
		System.out.println(n--);
		System.out.println(n);
		System.out.println();

		System.out.println(n);
		System.out.println(++n);
		System.out.println(n);

		// FROM YOUTUBE VIDEO FOR LOOPS INCREMENTS AND DECREMENT (POST AND PRE),
		// MODIFYED TO SEE MESSAGE

		System.out.println("Demo Postfix Decrement Operator");
		System.out.printf(" n:%d\n", n);
		System.out.printf(" n--:%d\n", n--);
		System.out.printf(" n:%d\n", n);

		System.out.println("\nDemo Prefis Decrement Opertor:");
		System.out.printf(" n:%d\n", n);
		System.out.printf(" --n:%d\n", --n);
		System.out.printf(" n:%d\n", n);

		System.out.println("************************************");

		// WHILE LOOP EXAMPLE INCREMENT 

		int x = 10;
		while (x < 20) {
			System.out.println(" Value of x : " + x);
			x++;
			System.out.println("\n");
		}

		System.out.println("************************************");

		// WHILE LOOP EXAMPLE INCREMENT 

		int y = 10;
		while (y < 20) {
			y++;
			System.out.println(" Value of y : " + y);
			System.out.println("\n");
		}

	}

}
