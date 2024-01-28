package com.noorteck.java.day23;

public class DemoAr5 {
	public static void main(String[] args) {
		String state[] = { "CA", "FL", "AZ", "MO", "VA", "NY", "VA", "NY", "NY" };

		// Print each element in an array
		System.out.println(state[0]);
		System.out.println(state[1]);
		System.out.println(state[2]);
		System.out.println(state[3]);
		System.out.println(state[4]);
		System.out.println(state[5]);
		System.out.println(state[6]);
		System.out.println(state[7]);
		System.out.println(state[8]);

		System.out.println("***********************");

		// Better approach is using LOOP
		// 1.For Loop
		for (int i = 0; i < state.length; i++) {
			System.out.println(state[i]);
		}

		System.out.println("***********************");

		// 2.While loop

		int j = 0;
		while (j < state.length) {
			System.out.println(state[j]);

			j++;
		}

		System.out.println("***********************");
		// 3. Do While Loop

		int y = 0;
		do {
			System.out.println(state[y]);
			y++;
		} while (y < state.length);
	}
}
