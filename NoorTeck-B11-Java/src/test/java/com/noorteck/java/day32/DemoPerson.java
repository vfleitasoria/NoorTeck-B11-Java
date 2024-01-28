package com.noorteck.java.day32;

public class DemoPerson {
	
	public static void main(String[]args) {
		
		
	Person p1 = new Person();//Parent Reference to Parent Class Object
	Person p2 = new Kid();//Parent Reference to Child Class Object
	
	p1.walk();
	p2.walk();
	
	System.out.println(p1.age);
	System.out.println(p2.age);
	
		
	}

}
