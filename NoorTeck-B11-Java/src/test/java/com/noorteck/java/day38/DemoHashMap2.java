package com.noorteck.java.day38;

import java.util.HashMap;

public class DemoHashMap2 {
	
	public static void main(String[]args) {
		
		HashMap<String, String> stateMap = new HashMap<String, String>();
		
		stateMap.put("VA",  "Virginia");
		stateMap.put("NY", "New York");
		
		
		HashMap<Integer, Character> gradeMap = new HashMap<Integer, Character>();
		
		gradeMap.put(90,  'A');
		gradeMap.put(80,  'B');
		
		
		HashMap<String, Double> priceMap = new HashMap<String, Double>();
		
		priceMap.put("Iphone", 2500.00);
		priceMap.put("Mac", 3500.00);
		
		System.out.println(stateMap.get("NY"));//For NY the key value is "New York
		System.out.println(gradeMap.get(80));//For key 80 the value is 'B'
		System.out.println(priceMap.get("Mac"));//For key Mac the value is 3500.00
		
		
		
		
	}

}
/**
To retrieve the value from the Map, we can use get()
         a. get()--->takes 1 parameter and we need to pass the key as parameter
         b. then the get() will return the Value for that key
         
         
     HashMap                                   LikedHashMap
   ---------------------------------------------------------------------------
  1. Does not keep insertion order             1. Does not keep insertion order
  2. Key is unique, Value can be duplicate     2. Key is unique, Value can be duplicate
  3. Can have 1 null Key                       3. Can have 1 null Key
  4. Can have 1 or more null Value             4. Can have 1 or more null Value
  5. Not Synchronized                          5. Not Synchronized
         
         
         
*/