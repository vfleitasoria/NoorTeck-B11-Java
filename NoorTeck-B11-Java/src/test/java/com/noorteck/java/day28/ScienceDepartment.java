package com.noorteck.java.day28;

public class ScienceDepartment extends School {

	//non-static method
	public void getData() {
		//call id variable and set value 777
		id = 777;

		//call gender variable and set value f
		gender = 'f';
	}
	
	
	//static method
	public static void getInfo() {
		//call id variable and set value 789
		
		/**
		 * We need to create an object
		 * 	object of which class?
		 * 		The ParentClass?
		 * 		The ChildClass??
		 */
		
		//Created object of Parent CLass
		School obj = new School();
		obj.id = 123;
		
		//Create object of Child Class
		ScienceDepartment s = new ScienceDepartment();		
		s.id  = 456;
			
		//call gender variable and set value m
		gender = 'm';

	}
	
}