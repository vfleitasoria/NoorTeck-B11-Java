package com.noorteck.java.day8;

public class SumForLoopOdd {
	public static void main(String args[]) {
		int eventotal=0;
		int oddtotal=0;
		for (int i=1;i<=10;i++) {
			if(i%2==0) {
				eventotal=eventotal+i;
				
			}else {
				oddtotal=oddtotal+i;
			}
		System.out.println("Even Total: "+eventotal);
		System.out.println("Odd Total: "+oddtotal);
		}
		
		
	}

}
