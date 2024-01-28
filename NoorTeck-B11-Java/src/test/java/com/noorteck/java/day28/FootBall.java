package com.noorteck.java.day28;

public class FootBall extends Sport{
public void getInfo() {
		
		age = 11;//We have access to public 		
		isStatus = false;//We have access to protected	
		count = 88; //we don't have access because Default access modifier	
		password = "12345"; //we don't have access because private access modifier		
	}
}


