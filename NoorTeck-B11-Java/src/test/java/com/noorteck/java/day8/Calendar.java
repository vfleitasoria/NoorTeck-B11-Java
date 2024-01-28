package com.noorteck.java.day8;

public class Calendar {
	public static void main(String args[]) {

		String amOrPM = "NONE";// To keep track AM or PM

		for (int hour = 1; hour <= 12; hour++) {
			System.out.println(hour + "AM");
		}
		for (int hour = 1; hour <= 12; hour++) {

			System.out.println(hour + "PM");
		}

		System.out.println("************************");

		String amorPM = "NONE";// To keep track AM or PM
		int resetHour = 0;
		
		
		for (int hour = 1; hour <= 12; hour++) {
			resetHour++;
			if (resetHour >12) {
				amOrPM = "PM";
			} else {
				amOrPM = "AM";
			}
			System.out.println(hour + amOrPM);
			if (hour == 12) {
				hour = 0;
			}
			if (resetHour == 24) {
				break;

			}

		}

	}
}

/**
 * Part 1: 1 Day ---> 24 Hours Write for loop that print hours of the day Call
 * AM ------ PM
 */