package com.noorteck.java.day21;

public class DemoSB1 {
	public static void main(String[]args) {
		
		
		
		
		//String Builder
		StringBuilder sBuilder= new StringBuilder("John");
		System.out.println(sBuilder);//John
		sBuilder.append(" Cena");//John Cena
		System.out.println(sBuilder);//John Cena
		
		
		
		
		
		//String Buffer
		StringBuffer sBuffer= new StringBuffer("Java");
		System.out.println(sBuffer);//Java
		sBuffer.append(" Program");//Java Program
		System.out.println(sBuffer);//Java Program
		
	}

}
/**

reverse() --> it reverse the string
  
 */