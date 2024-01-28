package com.noorteck.java.day28;
//Parent Class
public class Sport {
	
	public int age;//public access modifier
	int count;//default access modifier
	protected boolean isStatus;//protected access modifier
	private String password;//private access modifier
	

}


/**
	if the access modifier is private for variable & method
		then CHILD will not have access to the private members
	Access Modifier:
	
		1. public:  accessible from same package &  different package
		2. private: accessible from same class,
		but cannot access outside the class
		(does not matter if it is in same package or different package)
		3. default:  Accessible form same package, but cannot access from 
		different  package
		4. protected: Accessible from same package, but cannot access form 
		different package
		BUT there is a way, we can access if we have IS-A Relationship between class
		
*/





/