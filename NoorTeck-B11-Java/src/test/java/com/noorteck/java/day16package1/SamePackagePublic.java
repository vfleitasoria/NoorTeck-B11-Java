package com.noorteck.java.day16package1;

public class SamePackagePublic {
	public static void main(String args[]) {
		
	//Access the same members
		System.out.println(DemoPublic.city);
		DemoPublic.subtract( 2 , 2 );
		
		//Access the Non-Static member
		
		DemoPublic obj = new DemoPublic ();
		System.out.println(obj.country);
		obj.add(2 , 4);
		
		
	}

}
