package com.Halloween2;

public class TheSon extends TheDad {//misspelling inherits to extends
	private char grade;
	
	public final boolean IS_JAVA_FUN = true;// Assign value during the declaration of the final variable
	public final String MY_STATE = "VA";

	private int age;//created private variable
    private String country;//created private variable
	
    public void setGrade(char grade) {//misspelling remove semicolon
		this.grade = grade;
	}
	
	public char getGrade() {
		System.out.println(grade);
		return grade;//add return for the method
	}
	
	
	protected void trapZone() {
		char myGrade;
		
		int myFavNumber= 123;	
		System.out.println("My FavNumber" + myFavNumber);
		
		String teamName= "NVCC";		
		System.out.println("My Team Name: " + teamName);
		
		
		String schoolName = "NVCC";//remove modifier to default to local variable		
		System.out.println("My School Name: "+ schoolName);
		
	
		grade = myGrade='A';
		System.out.println("My Grade: " + grade);
		
		
		age = 12;	//created private variable	
		System.out.println("My age " + age);
		
		country = "USA";	
		System.out.println("Country :" + country);//created private variable
		
		//IS_JAVA_FUN = true;//is FINAL we cannot change the value
			
	}
	
	public void moreTrap(char grade) {
		this.grade = grade;
		
		MY_STATE = "CA";//Expected ERROR is Final
		
		setCountry("USA");		
		String country = getCountry();
		
	    setCity("Reston");
		String city = getCity();
		
		setAge(12);
		int age = getAge();
				
		addNum(3,4);
	
		display(3, 5);
		
		trapZone();
		
	}

	
	}
	
	





