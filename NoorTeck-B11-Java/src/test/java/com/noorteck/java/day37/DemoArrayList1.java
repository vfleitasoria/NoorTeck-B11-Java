package com.noorteck.java.day37;

import java.util.ArrayList;
import java.util.LinkedList;

public class DemoArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> studentList = new ArrayList<String>();

		studentList.add("Cindy");
		studentList.add("Brian");
		studentList.add("Noor");
		studentList.add("Yahiya");
		studentList.add("Babur");

		System.out.println(studentList);

		// remove Brian
		studentList.remove(1);

		System.out.println("After Removing");

		System.out.println(studentList);

		System.out.println("**************");

		LinkedList<String> studentList2 = new LinkedList<String>();

		studentList2.add("Cindy");
		studentList2.add("Brian");
		studentList2.add("Noor");
		studentList2.add("Yahiya");
		studentList2.add("Babur");
		
		System.out.println(studentList);
		
		studentList2.add(2, "Kayla");
		
		System.out.println(studentList);
		

	}

}
