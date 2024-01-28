package com.noorteck.java.day38;

import java.util.HashMap;

public class DemoHashMap1 {
	
	public static void main(String[]args) {
		
		/**
		 > Parameter 1--> represent KEY
		 > Parameter 2--> represent VALUE
		 >>>>Key-Value may/may not be the same data type
		 */
		
		HashMap<Integer, String> courseMap = new HashMap<Integer, String>();
		
		//Add elements to the Map
		
		courseMap.put(100, "Java");
		courseMap.put(200, "Selenium");
		courseMap.put(300, "SQL");
		courseMap.put(400, "API");
		courseMap.put(500, "Jenkins");
		
		System.out.println(courseMap);
		System.out.println("Size of the Map: "+courseMap.size());
		
		System.out.println("****************************");
		
		//Adding duplicate values
		/**
		 * in Map we can have duplicate VALUE
		                 1 or more key may have same VALUE(add that is OK)
		 */
		courseMap.put(600,  "SQL");
		courseMap.put(700,  "API");
		
		System.out.println(courseMap);
		System.out.println("****************************");
		
		/**
		 * Duplicate Key:
		 * we can not have a duplicate Key
		 * if we provide duplicate key it will simply override
		 */
		
		courseMap.put(100, "Java");//This will override previous value with new value we provide
		System.out.println(courseMap);
		courseMap.put(100, "Java with Coffee");
		System.out.println(courseMap);
		
		System.out.println("****************************");
		
		/**
		 * null Value:
		 * in Map we can have many null values as want
		 */
		
		courseMap.put(1111, null);
		courseMap.put(2222, null);
		courseMap.put(3333, null);
		
		System.out.println(courseMap);
		System.out.println("****************************");
		
		/**
		 * null Key
		 * in Map we can have only 1 null Key
		 */
		
		courseMap.put(null, "Break");
		courseMap.put(null, "Lunch");
		courseMap.put(null, "Dinner");
		
		System.out.println(courseMap);
		
		
		
		
		
		
		
	}

}
