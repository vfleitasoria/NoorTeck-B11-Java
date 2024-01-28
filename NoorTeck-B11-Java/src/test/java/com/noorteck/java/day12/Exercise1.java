package com.noorteck.java.day12;

public class Exercise1 {
public static void main(String args[]) {
	
	boolean r1= sleepIn(false,false);
	boolean r2= sleepIn(true,false);
	boolean r3= sleepIn(true,true);
	boolean r4= sleepIn(false,true);
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);
	
	
}
public static boolean sleepIn(boolean isWeekDay, boolean isVacation) {
	boolean result = false;
	
	if (!isWeekDay||isVacation==true) {
		result=true;
		
	}//else {
		//result=false;}
		
		return result;
		
	}
	
}

