package com.noorteck.java.day21;

public class DemoSB3 {
	
public static void main(String[]args) {
		
		
		
		
		//String Builder
		StringBuilder sBuilder= new StringBuilder("Java");
		
		sBuilder.insert(2,"World");
		System.out.println(sBuilder);//John Cena
		
		
		
		
		
		//String Buffer
		StringBuffer sBuffer= new StringBuffer("Java");
		
		sBuffer.insert(2,"World");
		System.out.println(sBuffer);
		
	}

}
/**
insert()

	--> it takes 2 parametres (index number and string value)
		it will insert the string value(param2) from given index position in orignal string value


*/

