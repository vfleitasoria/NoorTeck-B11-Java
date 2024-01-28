package com.noorteck.Practice.java;

public class ifElsePractice5 {
	public static void main(String args[]) {

		/*
		 * Get maximum of 3 number
		 */

		int n1 = 5;
		int n2 = 13;
		int n3 = 7;
		int max = n1;
		if (n2 > max) {
			max = n2;
		}if (n3 > max) {
			max = n3;}
		System.out.println(max);
	}

}
