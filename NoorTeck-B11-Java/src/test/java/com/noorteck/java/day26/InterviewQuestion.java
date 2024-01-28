package com.noorteck.java.day26;

public class InterviewQuestion {
	public static void main(String[] args) {

		String str = "Jackie,Zain,Ellen,Alishan,Vladimir,Ahmed";

		String strArr[] = str.split(",");

		for (int i = 0; i < strArr.length; i++) {
			String n = strArr[i];
			System.out.println(n);
			
		}

	}

}
/**
 * You are given String What i want you do is return the names backwards then
 * return as new String array
 */