package com.noorteck.java.day30;

public class DemoOverloading4 {
	
	//Return type is VOID ---->Expected Error
	public void getInfo(String name,int age) {
		System.out.println(name);
		System.out.println(age);
	}
	public int getInfo(String name,int age) {
		int result = 0;
		return result;
	}
	public String getInfo(String name,int age) {
		String result = "";
		return result;
	}
	

}
/**
Method Overloading happens in SAME CLASS, when we have 2 or more METHODS with the SAME METHOD NAME but different parameters.
	WHen we have different parameter it can be different in one of the following ways:
	
		1. THe # of parameters are diff
		2. The data type of the parameters are diff
		3. or the Sequence of datatype is diff
		What if Everything is SAME, 
		> the Method name is SAME
		> The parameter is SAME, ( the data type is same, the # of param is Same && the sequence of param is also same)
		
		
		BUT the RETURN type is different, would this coonsider a method overloading 

Nooooooooooooooooooooooooooooooooooooo, if everything is same except the return type then it will not consider
metohd overloading, it wil give us an ERROR
*/