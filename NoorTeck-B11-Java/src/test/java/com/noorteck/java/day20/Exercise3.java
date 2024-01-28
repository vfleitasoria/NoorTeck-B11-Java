package com.noorteck.java.day20;

public class Exercise3 {
	public static void main(String[] args) {
		isEqualLength("Pro" , "Ali");
		isEqualLength("java" , "Learning");
		isEqualLength("java training" , "java");
	}

	public static void isEqualLength(String strOne, String strTwo) {
		int strOneLength = strOne.length();
		int strTwoLength = strTwo.length();

		if (strOneLength == strTwoLength) {
			String s = strOne.concat(strTwo);
			int length = s.length();
			System.out.println(s + " " + length);
		} else if (strOneLength > strTwoLength) {
			System.out.println(strOne.toUpperCase() + " " + strOneLength);

		} else {
			System.out.println(strTwo.toLowerCase() + " " + strTwoLength);
		}
	}

}
