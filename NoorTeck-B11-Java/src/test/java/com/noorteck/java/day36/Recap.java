package com.noorteck.java.day36;

public class Recap {

	public static void main(String[] args) {

		String state[] = { "VA", "MD", "NY", "AL", "AZ", "TX", "FL", "NY", "MD" };
		// 1. Using for loop iterate through state array and print each value

		for (int i = 0; i <= state.length; i++) {
			System.out.println(state[i]);
		}
		System.out.println("**********************************");

		// 2. Using while loop iterate through state array and print each value
		int y = 0;
		while (y < state.length) {
			System.out.println(state[y]);
			y++;

		}
		System.out.println("**********************************");

		// 3. Using do while loop iterate through state array and print each value

		int j = 0;
		do {
			System.out.println(state[j]);
			j++;
		} while (j < state.length);
	}

}
