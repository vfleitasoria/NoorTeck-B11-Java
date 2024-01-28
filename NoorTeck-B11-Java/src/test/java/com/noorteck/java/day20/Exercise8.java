package com.noorteck.java.day20;

public class Exercise8 {

	public static void main(String[] args) {
		char r1 = getCharacter("java training", 2);
		char r2 = getCharacter("java training", 5);
		char r3 = getCharacter("java training", 8);
		char r4 = getCharacter("java training", 22);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);

	}

	public static char getCharacter(String strOne, int indexNum) {
	 char result = ' ';
	 
	 if (indexNum>=strOne.length()) {
		 result ='?';
	 }else {
		 result=strOne.charAt(indexNum);
	 }
	 return result;
     
}
}
