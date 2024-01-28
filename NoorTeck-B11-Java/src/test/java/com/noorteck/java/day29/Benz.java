package com.noorteck.java.day29;

public class Benz {
	
	public void getData() {
		
		Car obj = new Car();
		 obj.year = 2022;
		 obj.color();
		 System.out.println(obj.COUNT);
		 
		 
		 //We can not re-assing new value(Expected ERROR)
		 obj.COUNT = 11;
		 
		 
	}

}
