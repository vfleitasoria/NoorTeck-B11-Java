package com.noorteck.java.day14;

public class INSTANCE2 {
	
	// non - static method
	public void getName() {
		System.out.println("John Cena......");
		
	}

	
	
	
	
	// non-static method
	public void display() {
		//How to call NON - STATIC METHOD from another NON - STATIC MATHOD BODY in the SAME CLASS
		getName();
		
	}
}
