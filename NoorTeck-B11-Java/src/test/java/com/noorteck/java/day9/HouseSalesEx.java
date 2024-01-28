package com.noorteck.java.day9;

public class HouseSalesEx {
	public static void main (String args[]) {
		
		
		int option=1;
		String houseViewType="";
		int price=0;
		boolean isValidOption=true;
		String errorMessage="NONE";
		if (option==1) {
			houseViewType="PARK VIEW";
			price=150000;}
		else if (option==2) {
			houseViewType="GOLF COURSE VIEW";
			price=250000;}
		else if (option==3) {
			houseViewType="LAKE VIEW";
			price=350000;}
		else {
			errorMessage="INVALID OPTION NUMBER";
			isValidOption=false;
			System.out.println(errorMessage);}
		
		System.out.println("Type:"+houseViewType);
		System.out.println("Cost: $"+price);
			
		}
	}


