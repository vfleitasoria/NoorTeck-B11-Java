package com.noorteck.java.day12;

public class Exercise9 {
	public static void main(String args[]) {
		
	boolean r1=shouldWakeUp(false,5);
	boolean r2=shouldWakeUp(true,5);
	boolean r3=shouldWakeUp(false,15);
	boolean r4=shouldWakeUp(true,15);
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);
	
	
	}
public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
	boolean result=false;
	
	if (barking ==true&&(hourOfDay>=0&&hourOfDay<=8)) {
		result=true;
		
	}
	
	
	
	
	return result;
}
}
