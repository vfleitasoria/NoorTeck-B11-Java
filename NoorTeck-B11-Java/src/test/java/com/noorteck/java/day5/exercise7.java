package com.noorteck.java.day5;

public class exercise7 {
	public static void main (String args[]) {
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
	}

}
