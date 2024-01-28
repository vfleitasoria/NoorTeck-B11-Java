package com.noorteck.java.day14;

public class CarStaticDemo {
	public static void main (String args []) {
		
		
		CarStatic c1= new CarStatic();
		CarStatic c2= new CarStatic();
		CarStatic c3= new CarStatic();
		
		c1.id=111;
		c1.make="Honda";
		c1.price=10.0;
		
		c2.id=222;
		c2.make="Tesla";
		c2.price=20.0;
		
		c3.id=333;
		c3.make="BMW";
		c3.price=30.0;
		
		System.out.println(c1.id);
		System.out.println(c1.make);
		System.out.println(c1.price);
		System.out.println("*******************");
		
		System.out.println(c2.id);
		System.out.println(c2.make);
		System.out.println(c2.price);
		System.out.println("*******************");
		
		System.out.println(c3.id);
		System.out.println(c3.make);
		System.out.println(c3.price);
	}

}
