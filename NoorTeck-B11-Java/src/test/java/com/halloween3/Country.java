package com.halloween3;

public abstract class Country implements World{//Change to implement
	
	private String name;
	private int population;
	
	public Country(String name, int population) {
		//super();//remove argument to match object
		this.name = name;
		this.population = population;
	}
	public String getName() {
		return name;
	}
	
	
	public void displayInfo() {
		System.out.println("Name: " + name + ", Population: " + population);
	}
	
	public  void setCurrency() {
		System.out.println("Dollar: $");
	}
	
	public void getHoliday() {
		System.out.println("Country: Holiday");
	}
	
	public abstract void setLanguage();
	public abstract void  setFood();
	
		
		
	}


