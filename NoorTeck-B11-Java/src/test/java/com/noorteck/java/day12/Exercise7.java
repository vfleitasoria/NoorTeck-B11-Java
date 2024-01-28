package com.noorteck.java.day12;

public class Exercise7 {
	public static void main(String args[]) {

		boolean value1 = inRange(13, 55);
		boolean value2 = inRange(55, 13);
		boolean value3 = inRange(55, 55);
		boolean value4 = inRange(13, 13);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);

	}

	public static boolean inRange(int numOne, int numTwo) {
		boolean result = false;
		boolean isNumberOneWithInRange = (numOne >= 10 && numOne <= 20);
		boolean isNumberTwoWithInRange = (numTwo >= 10 && numTwo <= 20);

		if (isNumberOneWithInRange == true && isNumberTwoWithInRange == false) {
			result = true;
		} else if (isNumberOneWithInRange == false && isNumberTwoWithInRange == true) {
			result = true;
		}

		return result;

	}
}
