package com.noorteck.java.day12;

public class Exercise4 {
	public static void main(String args[]) {

		int n1 = difference21(15);
		int n2 = difference21(25);
		System.out.println(n1);//       21 - 15 = 6
		System.out.println(n2);//  (25 - 21)* 2 = 8 

	}

	public static int difference21(int num) {
		int result = 0;
		if (num <= 21) {
			result = 21 - num;
		} else if (num > 21) {
			result = (2 * (num - 21));
		}

		return result;
	}
}
