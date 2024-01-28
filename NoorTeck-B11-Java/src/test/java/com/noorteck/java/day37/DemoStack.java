package com.noorteck.java.day37;

import java.util.Stack;

public class DemoStack {
	
	public static void main(String[]args) {
		
		Stack<String> bookStack = new Stack<String>();
		
		// add element on top of the stack
		
		bookStack.push("java");
		bookStack.push("Selenium");
		bookStack.push("SQL");
		bookStack.push("API");
		
		System.out.println(bookStack.peek());//API
		System.out.println(bookStack.peek());//API
		System.out.println(bookStack.peek());//API
		
		System.out.println("*****************");
		
		System.out.println(bookStack.pop());//API
		System.out.println(bookStack.pop());//SQL
		System.out.println(bookStack.pop());//Selenium
		
		
		
	}

}
/**
 Stack Class
 
  >Inherit Vector Class
  >Based on Last
   In First Out (LIFO) data structure
  
  
  push() --> adds elements on top of the stack
  
  
  pop() --> return & remove the element from the top of the stack
  
  peek() -->return the element on top of the stack but does not remove the element
  */
