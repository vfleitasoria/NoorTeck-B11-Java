package com.noorteck.java.day5;

public class Day4HWSolution {
	public static void main (String args []) {
		
		int exam1 = 88;
		int exam2 = 68;
		int exam3 = 92;
		int exam4 = 77;
		int exam5 = 49;

		int exSum = (exam1 + exam2 + exam3 + exam4 + exam5);

		int exDiff = (exam1 - exam2 - exam3 - exam4 - exam5);

		double exAvg = exSum / 5;

		System.out.println(
				"Sum:" + exam1 + " + " + exam2 + " + " + exam3 + " + " + exam4 + " + " + exam5 + " = " + exSum);
		System.out.println(
				"Difference:" + exam1 + " - " + exam2 + " - " + exam3 + " - " + exam4 + " - " + exam5 + " = " + exDiff);
		System.out.println("Average:(" + exam1 + " + " + exam2 + " + " + exam3 + " + " + exam4 + " + " + exam5
				+ " )/5 = " + exAvg);
	}

}
