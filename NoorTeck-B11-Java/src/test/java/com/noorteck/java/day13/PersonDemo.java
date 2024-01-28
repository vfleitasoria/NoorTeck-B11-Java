package com.noorteck.java.day13;

public class PersonDemo {
	public static void main(String args[]) {
		
		Person p1= new Person();
		Person p2= new Person();
		Person p3= new Person();
		
		
		p1.name="John Cena";
		p1.age=22;
		p1.country="USA";
		
		p1.name="Tom";
		p1.age=33;
		p1.country="England";
		
		p1.name="Tim";
		p1.age=44;
		p1.country="Canada";
		
		
		
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.country);
		System.out.println("*********************");
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.country);
		System.out.println("*********************");
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.country);
		System.out.println("*********************");
		
		p1.sleep();
		p1.eat();
		p1.workout();
		p1.study();

		p2.sleep();
		p2.eat();
		p2.workout();
		p2.study();
		
		p3.sleep();
		p3.eat();
		p3.workout();
		p3.study();
		
		
	}

}
