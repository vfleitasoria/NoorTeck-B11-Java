package com.noorteck.java.day12;

public class Exercise3 {
	public static void main(String args[]) {
		int x = getOutcome(20, 20);
		System.out.println(x);
	}

	public static int getOutcome(int numOne, int numTwo) {
		int result = 0;
		if (numOne > numTwo) {
			result = numOne - numTwo;
		} else if (numOne < numTwo) {
			result = numOne + numTwo;
		} else   {
			result = (2 * (numOne + numTwo));
		}

		return result;
	}
}
