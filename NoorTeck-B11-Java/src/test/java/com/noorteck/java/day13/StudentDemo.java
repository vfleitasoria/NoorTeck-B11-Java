package com.noorteck.java.day13;

public class StudentDemo {
	public static void main(String args[]) {
		// Student 1
		Student s1=new Student();
		s1.id=111;
		s1. firstName="Brian";
		s1.lastName="P";
		
		
		// Student 2
		Student s2 = new Student();
		s2.id= 222;
		s2.firstName="Ellen";
		s2.lastName="S";
		 
		
		System.out.println(s1.id);
		System.out.println(s1.firstName);
		System.out.println(s1.lastName);
		
		System.out.println("************************");
		
		System.out.println(s2.id);
		System.out.println(s2.firstName);
		System.out.println(s2.lastName);
		
		

		
	}

}
