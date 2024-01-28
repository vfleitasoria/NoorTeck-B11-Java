package com.noorteck.java.day36;

public class Recap2 {
	public static void main(String[] args) {

		String state[] = { "VA", "MD", "NY", "AL", "AZ", "TX", "FL", "NY", "MD" };
		// 1. Using for loop iterate through state array and print each value

		for (int i = state.length-1; i >= 0; i--) {
			System.out.println(state[i]);
		}
		System.out.println("**********************************");

		// 2. Using while loop iterate through state array and print each value
		int y = state.length-1;
		while (y >= 0) {
			System.out.println(state[y]);
			y--;

		}
		System.out.println("**********************************");

		// 3. Using do while loop iterate through state array and print each value

		int j = state.length-1;
		do {
			System.out.println(state[j]);
			j--;
		} while (j >= 0);
	}

}


