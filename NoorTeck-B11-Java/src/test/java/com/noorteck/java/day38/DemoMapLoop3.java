package com.noorteck.java.day38;

import java.util.LinkedHashMap;
import java.util.Map;

public class DemoMapLoop3 {
	
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> gradeMap = new LinkedHashMap<String, Integer>();

		gradeMap.put("Ahmed", 80);
		gradeMap.put("Jakie", 90);
		gradeMap.put("Ehsan", 100);
		gradeMap.put("Alishan", 70);
		gradeMap.put("Zain", 60);
		gradeMap.put("Noor", 50);
		gradeMap.put("Kayla", 40);
		gradeMap.put("Babur", 30);

		for (Map.Entry<String, Integer> entry : gradeMap.entrySet()) {

			String name = entry.getKey();
			int grade = entry.getValue();

			if (entry.getValue() >= 85) {
				System.out.println(name + " : " + grade);
			}
		}

		System.out.println("***************************");

		int sum = 0;
		for (Map.Entry<String, Integer> entry : gradeMap.entrySet()) {

			int grade = entry.getValue();
			sum = sum + grade;
		}
		int avg = sum / gradeMap.size();
		System.out.println("Average Grade: " + avg);
	}
    			
		
		/**
		 * Task 1: Loop through the map and print (Name, Score)only those students that has 
		 85 0r above grade score
		 
		 Use entrySet() loop....
		 */
		
	}

	


