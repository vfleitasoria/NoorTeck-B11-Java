package com.noorteck.java.day36;

import java.util.LinkedList;

public class DemoLinkList {
	
	public static void main(String[]args) {
		
		LinkedList<Character> gradeList = new LinkedList<Character>();
		
		gradeList.add('A');
		gradeList.add('B');
		gradeList.add('C');
		gradeList.add('D');
		gradeList.add('F');
		gradeList.add('F');
		gradeList.add('C');
		gradeList.add('C');
		
		System.out.println(gradeList);
		System.out.println(gradeList.size());
		
		System.out.println(gradeList.getFirst());
		System.out.println(gradeList.getLast());
		
		
	}

}
