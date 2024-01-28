package com.noorteck.java.day16package2;

import com.noorteck.java.day16package1.DemoPublic;

public class DiffPackagePublic {
	public static void main (String args[]) {
		
		
		//Access the static Member
		System.out.println(DemoPublic.city);
		DemoPublic.subtract(2, 2);
		
		//Access the Non-Static member
		DemoPublic obj = new DemoPublic();
		System.out.println(obj.country);
		obj.add(3, 3);
		
	}

}
