package com.noorteck.java.day9;

public class HomeWorkEx1 {
	public static void main(String args[]) {

		/*
		 * Suppose • temperature is a variable of type int. The value of temperature can
		 * be any number (Assign random number) • howIsWeather is a variable of type
		 * String. Set the value of howIsWeather to empty String • howShouldIDrive is a
		 * variable of type String. Set the value of howShouldIDrive to empty String •
		 * message is a variable of type String. Set the value of message to empty
		 * String • isStatus is a variable of type boolean. Set the value of isStatus to
		 * true Write a java program that determines howIsWeather based on the
		 * temperature
		 * 
		 * • When temperature is below 30 then o Assign value FREEZING to variable
		 * howIsWeather
		 * 
		 * • When temperature is below 50 then o Assign value COLD to variable
		 * howIsWeather
		 * 
		 * • When temperature is below 90 then o Assign value HOT to variable
		 * howIsWeather
		 * 
		 * • When temperature value is above 90 then o Assign value ERROR to variable
		 * howIsWeather o Assign value Read Requirement Out loud to variable message o
		 * Assign value false to variable isStatus
		 */

		int temp = 95;
		String howIsWeather = "";
		String howShouldIDrive = "";
		String message = "";
		boolean isStatus = true;
		if (temp < 30) {
			howIsWeather = "FREEZING";
			howShouldIDrive = "Don't Drive";
		}
		if (temp < 50 && temp > 30) {
			howIsWeather = "COLD";
			howShouldIDrive = "Drive with Heater On";
		}
		if (temp > 50 && temp < 90)
			;
		{
			howIsWeather = "HOT";
			howShouldIDrive = "Drive with AC On";
		}
		if (temp > 90) {
			howIsWeather = "ERROR";
			message = "Read Requirement Out Loud";
			System.out.println("What is the Temperature: " + temp);
			System.out.println("How is the Weather: " + howIsWeather);
			System.out.println("How Should I Drive: " + howShouldIDrive);
			isStatus = false;
			
		}

		//System.out.println("What is the Temperature: " + temp);
		//System.out.println("How is the Weather: " + howIsWeather);
		//System.out.println("How Should I Drive: " + howShouldIDrive);
	}

}
