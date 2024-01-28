package com.noorteck.java.day5;

public class exercise6 {
	public static void main (String args []) {
		char group = 'x';
		String team1 = "";
		String team2 = "";
		String team3 = "";
		String team4 = "";
		boolean isGroupExist = true;
		String message = "NONE";
		if (group == 'A') {
			message = "**************GROUP A**************";
			team1 = "Netherlands";
			team2 = "Senegal";
			team3 = "Ecuador";
			team4 = "Qatar";
		} else if (group == 'B') {
			message = "*************GROUP B***************";
			team1 = "England";
			team2 = "United States";
			team3 = "Iran";
			team4 = "Wales";
		} else if (group == 'C') {
			message = "*************GROUP C****************";
			team1 = "Argentina";
			team2 = "Poland";
			team3 = "Mexico";
			team4 = "Saudi Arabia";
		} else if (group == 'D') {
			message = "************GROUP D*****************";
			team1 = "France";
			team2 = "Australia";
			team3 = "Tunisia";
			team4 = "Denmark";
		} else if (group == 'E') {
			message = "**************GROUP E****************";
			team1 = "Japan";
			team2 = "Spain";
			team3 = "Germany";
			team4 = "Costa Rica";
		} else if (group == 'F') {
			message = "***************GROUP F****************";
			team1 = "Morocco";
			team2 = "Croatia";
			team3 = "Belgium";
			team4 = "Canada";
		} else if (group == 'G') {
			message = "****************GROUP G*****************";
			team1 = "Brazil";
			team2 = "Switzerland";
			team3 = "Cameroon";
			team4 = "Serbia";
		} else if (group == 'H') {
			message = "*****************GROUP H*****************";
			team1 = "Portugal";
			team2 = "South Korea";
			team3 = "Uruguay";
			team4 = "Ghana";
		} else {
			message = ("Group " + group + " not is part of the World Cup Table");
			isGroupExist = false;
			System.out.println("This Group " + group + " not exist; is " + isGroupExist);
		}
		
		System.out.println(message);
		System.out.println(group);
		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
		System.out.println(team4);
		System.out.println(isGroupExist);
	}

}
