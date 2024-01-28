package com.noorteck.java.day24;

public class Exercise6 {
	public static void main(String[] args) {

		int n1[] = { 6, 1, 2, 3 };
		int n2[] = { 13, 2, 3, 4, 6, 1, 2, 3 };
		int n3[] = { 3, 3, 0, 1, 4, 3, 6 };
		int n4[] = { 2, 6, 2 };

		boolean r1 = checkNum(n1); // FALSE
		boolean r2 = checkNum(n2); // TRUE
		boolean r3 = checkNum(n3); // FALSE
		boolean r4 = checkNum(n4); // TRUE

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);

	}

	protected static boolean checkNum(int number[]) {

		boolean result = false;

		int twoCount = 0;
		int fiveCount = 0;

		for (int i = 0; i < number.length; i++) {

			if (number[i] == 2) {
				twoCount++;

			} else if (number[i] == 5) {
				fiveCount++;

			}
			if (twoCount == 2 || fiveCount == 2) {
				result = true;
			}
		}

		return result;
	}
}

/**
 * Write a method that takes an array of int parameter and return true if the
 * array contains value 2 twice, or value 5 twice. Access
 * Modifier:------------------------protected Non-Access Modifier:
 * -------------------static Return Type:----------------------------boolean
 * Method Name:--------------------------- checkNum
 * Parameter1:---------------------------- int [] number
 */
