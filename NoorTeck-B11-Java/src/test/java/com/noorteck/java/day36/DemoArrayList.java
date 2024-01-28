package com.noorteck.java.day36;

import java.util.ArrayList;

public class DemoArrayList {
	public static void main(String[]args) {
		
		//Create an object of ArrayList
		ArrayList<String>studentList = new ArrayList<String>();
		
		//Add element of the ArrayList
		
		studentList.add("Zain");
		studentList.add("Ellen");
		studentList.add("Jackie");
		studentList.add("Babur");
		
		//Print an ArrayList values
		System.out.println(studentList);
		
		System.out.println("Size: "+studentList.size());
		System.out.println("***************");
		
		//Can we store duplicated values in ArrayList???
		
		studentList.add("Zain");
		studentList.add("Zain");
		studentList.add("Zain");
		
		System.out.println(studentList);
		System.out.println("***************");
		
		//How to retrieve element from specific position (INDEX NUMBER)
		
		System.out.println(studentList.get(5));//Zain
		System.out.println(studentList.get(2));//Jackie
		System.out.println("***************");
		
		//How to remove element from the ArrayList
		
		studentList.remove(3);//Babur will removed
		System.out.println(studentList);
		System.out.println("***************");
		
		//Add element in specific position
		
		studentList.add(1,"Kayla");//Add element in the INDEX 1(position 1)
		System.out.println(studentList);
		System.out.println("***************");
		
		studentList.add("Brian");//Store new element at the end of the ArrayList
		System.out.println(studentList);
		System.out.println("***************");
		
		
		
		
		
	}

}
/***
 ArrayList 
 
 	You need to know:
 	
 		1. Size of the ArrayList			---> size()
 		2. First Element in ArrayLIst		---> get(0)
 		3. Last Element in ArrayList			-->  get(arrayList.size()-1)
*/
