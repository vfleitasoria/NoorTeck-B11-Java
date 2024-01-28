package com.noorteck.java.day13;

public class StudentDetails {
	public static void main(String args[]) {
		System.out.println(exanOne);//EXPECTED ERROR,examOne IS LOCAL VARIABLE DECLARED INSIDE THE METHOD
		
	}
public static void examScore() {
	int examOne=77;//Local variable
	int examTwo=85;//Local variable
	String firstName="John";//Local variable
}
}
