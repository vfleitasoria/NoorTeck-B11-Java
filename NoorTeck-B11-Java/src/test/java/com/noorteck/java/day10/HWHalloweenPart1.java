package com.noorteck.java.day10;

public class HWHalloweenPart1 {
	public static void main(String args[]) {

		String firstName = "John";
		char LASTname = 'C';

		// print numbers 1-20
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);

		}

		int tempOne = 84;
		int tempTwo = 66;

		boolean result = true;

		if (tempOne >= 0 && tempTwo <= 100) {
			result = true;
		} else if (tempOne >= 100 && tempTwo <= 0) {
			result = true;
		} else {
			result = false;
		}

		System.out.println(result);

		int scoreOne = 88;
		int scoreTwo = 77;

		if (scoreOne > scoreTwo) {
			System.out.println("Team 1 has higher average score ");
			System.out.println("Team 1: " + scoreOne);
			System.out.println("Team 2: " + scoreTwo);

		} else if (scoreOne < scoreTwo) {
			System.out.println("Score: " + scoreOne);
			System.out.println("Score: " + scoreTwo);
		} else {
			System.out.println("Score: " + scoreOne);
			System.out.println("Score: " + scoreTwo);
		}

		String season = "";

		switch (season) {
		case "fall":
			System.out.println("Recovering from hot weather");
			break;
		case "winter":
			System.out.println("Toooo cold");

		case "spring":
			System.out.println("Recovering from cold weather");
			break;
		case "summer":
			System.out.println("Toooo hot");

		default:
			System.out.println("Season does not exist!");
		}

		for (int i = 0; i < 10; i++)
			;
		{

			int i = 0;
			if (i == 5) {
				System.out.println("Is equals to 5");
			} else {
				System.out.println("Is not equals");

			}
		}

	}

}
