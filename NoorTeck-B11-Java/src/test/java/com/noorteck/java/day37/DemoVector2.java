package com.noorteck.java.day37;

import java.util.Vector;

public class DemoVector2 {
	
	public static void main(String[]args) {
		
		
		//Vector with no params constructor
		Vector<String> v1 = new Vector<String>();//By default the capacity is 10
		
		//Vector with 1 params constructor
		Vector<String> v2 = new Vector<String>(12);//When we have parameters, the parameters will represent the capacity
		
		//Vector with 2 params constructor
		Vector<String> v3 = new Vector<String>(3, 4);
	}

}
/***
     1. size ----------->number of slots used currently
     
     2. capacity-------->max number of slot we can have
     
     
     
     
     
     Size for webinar   --->41
     capacity of webinar--->501
*/