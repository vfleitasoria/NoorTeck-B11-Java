package com.noorteck.java.day12;

public class Exercise6 {
	public static void main(String args[]) {
		boolean x1 = icyHot(101, -20);
		boolean x2 = icyHot(-40, 110);
		boolean x3 = icyHot(-440, 100);
		boolean x4 = icyHot(10, -20);
		boolean x5 = icyHot(11, 11);
		boolean x6 = icyHot(-100, -90);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		System.out.println(x6);

	}

	public static boolean icyHot(int tempOne, int tempTwo) {

		boolean result = false;

		if (tempOne < 0 && tempTwo > 100) {
			result = true;
		} else if (tempOne > 100 && tempTwo < 0){
			result = true;
		}
		return result;
	}
}
