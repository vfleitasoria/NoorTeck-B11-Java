package com.noorteck.java.day36;

public class EnhancedLoop {
	public static void main(String[] args) {

		String state[] = { "VA", "MD", "NY", "AL", "AZ", "TX", "FL", "NY", "MD" };
		// 1. Using for loop iterate through state array and print each value

		for (String s:state) {
			System.out.println(s);
		}
		System.out.println("**********************************");
		char gradeArr[] = {'A','B','C','D','E','F'};
		for(char grade : gradeArr) {
		System.out.println(grade);
		}
		System.out.println("**********************************");
		int favNumArr[]= {1,2,3,44,11,22};
		for(int fav : favNumArr) {;
		System.out.println(fav);
	}
		System.out.println("**********************************");
		boolean statusArr[]= {true,false,false,true};
		for(boolean status:statusArr) {
		System.out.println(status);
	}
		System.out.println("**********************************");
		double priceArr[]= {11.1,22.2,33.3,44.4,55.5};
		for(double price:priceArr) {
			System.out.println(price);
			
		}
		
}
}
