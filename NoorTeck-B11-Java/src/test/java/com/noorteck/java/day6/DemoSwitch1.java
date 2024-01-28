package com.noorteck.java.day6;

public class DemoSwitch1 {
	public static void main(String args[]) {

		String season = "summer";

		switch (season) {
		case "fall":
			System.out.println("Recovering for hot weather");
			break;
		case "winter":
			System.out.println("Too could");
			break;
		case "spring":
			System.out.println("Recovering from could weather");
			break;
		case "summer":
			System.out.println("Too hot");
			break;
		default:
			System.out.println("Invalid season...");
			break;

		}

	}

}
