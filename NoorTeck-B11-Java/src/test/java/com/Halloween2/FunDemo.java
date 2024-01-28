package com.Halloween2;

public class FunDemo {
public static void main(String[] args) {
		
		//The Grandpa Object	
		TheGrandpa grandpaObj = new TheGrandpa();
				
		grandpaObj.setCountry("USA");		
		grandpaObj.setCountry("USA");	
		System.out.println(grandpaObj.getCountry);
		
		grandpaObj.addNum(2,5);
		grandpaObj.display(0,0);
		
		
		grandpaObj.setAge(66);
		System.out.println(dadObj1.getAge());
		
	
		
		//TheDad object
		
		TheDad dadObj = new TheDad();//remove the argument to match with the TheDad
		
		dadObj.setAge(12);
		dadObj.setAge(33);		
		System.out.println(dadObj.getAge());
		int result = dadObj.favNumWho(7);
		
		dadObj.setCountry("Canada");
		System.out.println(dadObj.getCountry());
		
		
		//TheSon object
		TheSon sonObj = new TheSon();//remove the argument to match with the TheS
		
		sonObj.setGrade('A');
		
		char resultGrade = sonObj.getGrade();
		System.out.println(resultGrade);
		
		sonObj.addNum(3, 5);
		
		sonObj.setCity("Reston");
		
		System.out.println(sonObj.getCity());
		
		sonObj.trapZone();
		
		sonObj.moreTrap('e');
		
		System.out.println("Yes :)");
	}
}




