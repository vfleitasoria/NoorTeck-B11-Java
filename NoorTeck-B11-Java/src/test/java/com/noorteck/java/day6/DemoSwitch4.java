package com.noorteck.java.day6;

public class DemoSwitch4 {
	public static void main(String args[]) {

		String day = "Monday";
		String result = "";
		switch (day) {
		case "Monday":
			result = "Lecture day";
			break;
		case "Tuesday":
			result = "Tutoring Session";
			break;
		case "Wednesday":
			result = "Lecture day";
			break;
		case "Thursday":
			result = "Tutoring Session";
			break;
		case "Friday":
			result = "Lecture day";
			break;
		case "Saturday":
			result = "Java Fun Day";
			break;
		case "Sunday":
			result = "Lecture day";
			break;
		default:
			result = "Wrong Input";}
			
			
			System.out.println(result);

		}
	}


