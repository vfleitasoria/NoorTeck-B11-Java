package com.noorteck.java.day14;

public class CarDemo {
	public static void main (String args[]) {
		
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		
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
		System.out.println("*******************");
		
	}

}
