package com.noorteck.java.day5;

public class exercise4 {
	public static void main (String args []) {
		int dayNum = 4;
		boolean doIhaveLecture = false;
		boolean doIhaveExtraSession = false;
		boolean doIhaveTutoringSession = false;
		String instructorName = "NONE";
		String whatAmIDoing = "IDK";
		String time = "AM";

		if (dayNum == 1) {
			doIhaveLecture = true;
			doIhaveExtraSession = false;
			doIhaveTutoringSession = false;
			instructorName = "Fahim";
			whatAmIDoing = " Attending Lecture and trying not to blink ";
		}

		else if (dayNum == 3) {
			doIhaveLecture = true;
			doIhaveExtraSession = false;
			doIhaveTutoringSession = false;
			instructorName = "Fahim";
			whatAmIDoing = " Attending Lecture and trying not to blink ";
		}

		else if (dayNum == 5) {
			doIhaveLecture = true;
			doIhaveExtraSession = false;
			doIhaveTutoringSession = false;
			instructorName = "Fahim";
			whatAmIDoing = " Attending Lecture and trying not to blink ";
		}

		else if (dayNum == 7 && time == " PM ") {
			System.out.println(" PM ");
			doIhaveLecture = true;
			doIhaveExtraSession = false;
			doIhaveTutoringSession = false;
			instructorName = "Fahim";
			whatAmIDoing = " Attending Lecture and trying not to blink ";
		}

		else if (dayNum == 7 && time == "AM") {
			System.out.println(" AM ");
			instructorName = "Muhammet";
			doIhaveLecture = false;
			doIhaveExtraSession = true;
			whatAmIDoing = " Attending Extra Session to convince java to be my best friend ";
		}

		else if (dayNum == 2) {
			doIhaveLecture = false;
			doIhaveExtraSession = false;
			doIhaveTutoringSession = true;
			instructorName = "Muhammet";
			whatAmIDoing = " Attending Tutoring Session and having FUN with JAVA ";
		}

		else if (dayNum == 4) {
			doIhaveLecture = false;
			doIhaveExtraSession = false;
			doIhaveTutoringSession = true;
			instructorName = "Muhammet";
			whatAmIDoing = " Attending Tutoring Session and having FUN with JAVA ";
		}

		System.out.println(dayNum);
		System.out.println(doIhaveLecture);
		System.out.println(doIhaveExtraSession);
		System.out.println(doIhaveTutoringSession);
		System.out.println(instructorName);
		System.out.println(whatAmIDoing);
		System.out.println (time);

	}

}
