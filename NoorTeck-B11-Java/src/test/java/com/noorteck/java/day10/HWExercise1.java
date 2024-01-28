package com.noorteck.java.day10;

public class HWExercise1 {
	public static void main(String args[]) {

		int temp = 98;
		String howIsWeather = "";
		String howShouldIDrive = "";
		String message = "";
		boolean isStatus = true;
		if (temp < 30) {
			howIsWeather = "FREEZING";
			howShouldIDrive = "Don't Drive";
		}
		else if (temp < 50 ) {
			howIsWeather = "COLD";
			howShouldIDrive = "Drive with Heater On";
		}
		else if (temp < 90 )
		{
			howIsWeather = "HOT";
			howShouldIDrive = "Drive with AC On";
		}
		else  {
			howIsWeather = "ERROR";
			message = "Read Requirement Out Loud";
			System.out.println("What is the Temperature: " + temp);
			System.out.println("How is the Weather: " + howIsWeather);
			System.out.println("How Should I Drive: " + howShouldIDrive);
			isStatus = false;

		}

		 System.out.println("What is the Temperature: " + temp);
		 System.out.println("How is the Weather: " + howIsWeather);
		 System.out.println("How Should I Drive: " + howShouldIDrive);
	}

}
