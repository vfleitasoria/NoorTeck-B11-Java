package com.noorteck.java.day24;

public class Exercise1 {
	public static void main(String[]args) {
		
		int n1 [] = {6, 1, 2, 3};
		int n2 [] = {13, 6, 1, 2, 3};
		int n3 [] = {0, 1, 4, 3 ,6};
		int n4 [] = {0, 6, 0};
		boolean r1 = isFirstLast(n1); // TRUE
		boolean r2 =isFirstLast(n2); // FALSE
		boolean r3 =isFirstLast(n3); // TRUE
		boolean r4 =isFirstLast(n4); // FALSE
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
	}

	static boolean isFirstLast(int[] number) {

		boolean result = false;

		if (number[0] == 6 || number[number.length - 1] == 6) {
			result = true;

		}

		return result;

	}
}
