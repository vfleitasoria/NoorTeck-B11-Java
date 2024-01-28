package com.noorteck.java.day12;

public class Exercise8 {
	public static void main(String args[]) {
		int x = getSML(1, 2, 3, "SMALEST");
		System.out.println(x);
	}

	public static int getSML(int n1, int n2, int n3, String str) {

		int smallest = n1;
		int medium = n1;
		int largest = n1;
		int result = 0;
		

		if (n1 < n2 && n1 < n3) {
			result = n1;

		} else if (n1 > n2 && n1 > n3) {
			result = n1;

		} else if (n1 > n2 && n1 < n3) {
			result = n1;

		} else {
			result = 404;

		}
		return result;

		

	}

}
