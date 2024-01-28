package com.noorteck.java.day27;

public class Country {
	private String name;
	private int numOfState;
	
	//Constructor
	public Country(String name, int numOfState) {
		this.name=name;
		this.numOfState=numOfState;
	}
		//SETTER
		public void setName(String name) {
			this.name= name;
		}
		//SETTER
		public void setNumOfState(int numOfState) {
			this.numOfState =numOfState;
			
		}
		public String getName() {
			return name;
		}
		public int getNumOfState() {
			return numOfState;
			
	}

}
