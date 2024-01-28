package com.noorteck.java.day26;

public class DemoMethod2 {
	public static void main(String[]args) {
		
		String str="Java is Fun and Kamy has a request";
		
		String strArr[]=str.split(" ");
		
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
			
		}
		System.out.println("**********");
		
		String str1="JavaisFunAndKamyhasArequest";
		String strArr1[]=str1.split("a");
		
		for(int i=0;i<strArr1.length;i++) {
			System.out.println(strArr1[i]);
		}
	}

}
