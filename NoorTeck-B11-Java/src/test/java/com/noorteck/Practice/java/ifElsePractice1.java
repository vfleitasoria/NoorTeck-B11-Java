package com.noorteck.Practice.java;

public class ifElsePractice1 {
	public static void main (String args[]) {
		
		/*
		 * If the value of age is between 0 and 17, print "you are a kid"
		 * If the value of age is between 18 and 60, print "You are an Adult"
		 * If the value of age is greater than 60 , print"You are getting Older" 
		 */
		
		int age=25;
		if(age>=0&&age<=17) {
			System.out.println(age + " You are a kid.");
		}else if (age>=18&&age<=60) {
				System.out.println(age + "You are an Adult");}
		else {
			System.out.println("You are geting Older");
			}
		}
	}


