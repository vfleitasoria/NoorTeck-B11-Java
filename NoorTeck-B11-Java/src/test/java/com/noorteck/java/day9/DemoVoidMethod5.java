package com.noorteck.java.day9;

public class DemoVoidMethod5 {

	public static void main(String[] args) {
		getDayofTheWeek(5);

	}

	public static void getDayofTheWeek(int number) {
		String day = "";
		if (number == 1) {
			day = "Monday";
		} else if (number == 2) {
			day = "Tuesday";
		} else if (number == 3) {
			day = "Wednesday";
		} else if (number == 4) {
			day = "Thursday";
		}else if (number == 5) {
			day = "Friday";
		} else if (number == 6) {
			day = "Saturday";
		} else if (number == 7) {
			day = "Sunday";
		} else {
			System.out.println("Have to be 1-----7 Number");
			System.out.println(number+day);
		}
	}

}
