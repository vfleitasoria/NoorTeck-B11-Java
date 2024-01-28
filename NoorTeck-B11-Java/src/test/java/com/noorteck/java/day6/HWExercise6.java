package com.noorteck.java.day6;

public class HWExercise6 {
	public static void main (String args[]) {
		char group = 'x';
		String team1 = "";
		String team2 = "";
		String team3 = "";
		String team4 = "";
		boolean isGroupExist = true;
		String message = "NONE";
		if (group == 'A') {
			
			team1 = "Netherlands";
			team2 = "Senegal";
			team3 = "Ecuador";
			team4 = "Qatar";
		} else if (group == 'B') {
			
			team1 = "England";
			team2 = "United States";
			team3 = "Iran";
			team4 = "Wales";
		} else if (group == 'C') {
			
			team1 = "Argentina";
			team2 = "Poland";
			team3 = "Mexico";
			team4 = "Saudi Arabia";
		} else if (group == 'D') {
			
			team1 = "France";
			team2 = "Australia";
			team3 = "Tunisia";
			team4 = "Denmark";
		} else if (group == 'E') {
			
			team1 = "Japan";
			team2 = "Spain";
			team3 = "Germany";
			team4 = "Costa Rica";
		} else if (group == 'F') {
			
			team1 = "Morocco";
			team2 = "Croatia";
			team3 = "Belgium";
			team4 = "Canada";
		} else if (group == 'G') {
			
			team1 = "Brazil";
			team2 = "Switzerland";
			team3 = "Cameroon";
			team4 = "Serbia";
		} else if (group == 'H') {
			
			team1 = "Portugal";
			team2 = "South Korea";
			team3 = "Uruguay";
			team4 = "Ghana";
		} else {
			message = " WRONG GROUP ";
			
			isGroupExist = false;
			
		}if (isGroupExist == true) {
		
		System.out.println("*********** GROUP " + group + "***********");
		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
		System.out.println(team4);
		}else {
		System.out.println(" Group " + group + " not is part of the WORLD CUP TABLE " );
		System.out.println("This Group " + group + " " + isGroupExist);}
			
		
		System.out.println("**********************************");
		
		//EXERCISE # 7 REVIEW
		
		
		String brand = "facebook";
		String slogan = "";
		boolean isSloganFound = true;
		
		if (brand == "Nike"){
			slogan = "Just Do It";}
		
			else if (brand == "Adidas"){
				slogan = "Imposible is Nothing";}
			else if (brand == "Puma") {
				slogan = "Forever Faster";}
			else if (brand == "ReeBok") {
				slogan = "I am what I am";}
			else {
				slogan = "Not Found";
		isSloganFound = false;}
		if (isSloganFound==true){
		System.out.println(brand + "'s slogan is " + slogan);}
		else {
		
		System.out.println(brand + "'s slogan is " + slogan + ". This message supose to give me hard time..." );}
		
		//EXERCISE # 8 REVIEW
		System.out.println("******************************");
		
		
		char mathOperation = '/';
		double numOne = 20.0;
		double numTwo = 5.0;
		double result = 0;
		String message1 = "NONE";
		boolean isCorrectOperation = true;
		
		if (mathOperation == '+') {
			result =(numOne + numTwo);
			System.out.println (numOne + " + " + numTwo + " = " + result);}
		else if (mathOperation == '-') {
			result =(numOne - numTwo);
			System.out.println (numOne + " - " + numTwo + " = " + result);}
		else if (mathOperation == '*') {
			result =(numOne * numTwo);
			System.out.println (numOne + " * " + numTwo + " = " + result);}
		else if (mathOperation == '/') {
			result =(numOne / numTwo);
			System.out.println (numOne + " / " + numTwo + " = " + result);}
		else if (mathOperation == '%') {
			result =((numOne * numTwo)/100);
			System.out.println (numOne + " & " + numTwo + " = " + result);}
		else  {
			message = "WRONG INPUT DATA";
			isCorrectOperation = false;
			System.out.println (message1);
			System.out.println (isCorrectOperation);}
		
		
		
		
		
		}
	}
		

	



	


