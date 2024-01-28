package com.noorteck.java.day38;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class DemoLinkedHashMap1 {

	public static void main(String[] args) {

		HashMap<Integer, String> courseMap = new HashMap<Integer, String>();

		// Add elements to the Map

		courseMap.put(100, "Java");
		courseMap.put(200, "Selenium");
		courseMap.put(300, "SQL");
		courseMap.put(400, "API");
		courseMap.put(500, "Jenkins");

		System.out.println(courseMap);
		System.out.println();

		LinkedHashMap<Integer, String> courseMap2 = new LinkedHashMap<Integer, String>();

		// Add elements to the Map

		courseMap2.put(100, "Java");
		courseMap2.put(200, "Selenium");
		courseMap2.put(300, "SQL");
		courseMap2.put(400, "API");
		courseMap2.put(500, "Jenkins");

		System.out.println(courseMap2);
		System.out.println();
		

	}
}

/**
     HashMap                                   LikedHashMap                                TreeMap
   -----------------------------------------------------------------------------------------------------------------------
  1. Does not keep insertion order             1. Does not keep insertion order            1. Does not keep insertion order but Store
  2. Key is unique, Value can be duplicate     2. Key is unique, Value can be duplicate       in ascending Order
  3. Can have 1 null Key                       3. Can have 1 null Key                      2.Key is unique, Value can duplicate
  4. Can have 1 or more null Value             4. Can have 1 or more null Value            3. Can have 1 null Key 
  5. Not Synchronized                          5. Not Synchronized                         4. Can have 1 or more null Value
                                                                                           5. Not Synchronized
 * */
