package com.noorteck.java.day14;

public class INSTANCE3demo {
	//Non Static method
	public void getCity(){
		
	//How to call INSTANCE VARIABLE from NON - STATIC METHOD BODY in DIFFERENT CLASS
		
		//Part 1. Create Class Object
		INSTANCE3 obj= new INSTANCE3();
		
		//Part 2. ObjectName.InstanceVariableName
		obj.city="Reston";
		System.out.println(obj.city);
		
		
	}
	

}
