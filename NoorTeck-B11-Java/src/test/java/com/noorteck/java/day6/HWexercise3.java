package com.noorteck.java.day6;

public class HWexercise3 {
	public static void main(String args[]) {
		char setGender = 'f';
		String getGender = "";
		switch (setGender) {
		case 'M':
		case 'm':
			getGender = ("MALE");
			break;
		case 'F':
		case 'f':
			getGender = ("FEMALE");
			break;
		default:
			System.out.println("OTHERS");}
			System.out.println(getGender);
		}

	}


