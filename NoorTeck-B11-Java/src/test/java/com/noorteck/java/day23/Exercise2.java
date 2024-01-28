package com.noorteck.java.day23;

public class Exercise2 {
	public static void main (String[]args) {
		
		String state[]= {"VA","TX","FL","NY","VA","CA",
				          "MO","ID","MS","ME","NY","TN", 
				          "UT","MO","HI","MN","PA","NY",
				          "ND","WA","NY","GA","CO","MD",
				          "VA","SD","NM","DE"};
		
		int vaCount=0;
		int nyCount=0;
		
		
		for (int i=0 ; i<state.length;i++){
		
			String s = state[i];
			if (s.equals("VA")) {
				vaCount++;
			}else if (s.equals("NY")) {
				nyCount++;
				
			}
			}
		System.out.println("VA: Count"+ vaCount);
		System.out.println("NY: Count"+ nyCount);
	}

}
/**
lOOP THROUGH STATE ARRAY AND FIND OUT HOW MAY TIMES 
VA appears in Array, and
NY appears in array
Then print the occurrence outside the loop

Expected 
VA--->3
NY--->4
*/