package com.Halloween2;

public class TheGrandpa {
	private String country;
	private String city;
	public char[] getCountry;

	public void setCountry(String country)// remove semicolon
	{
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	protected void setCity(String city) {// remove semicolon and S capital for String
		this.city = city;
	}

	protected String getCity() {
		return city;
	}

	public void display(int i, int j) {// Set method to return VOID and remove semicolon

		System.out.println("Country: " + country);// add semicolon
		System.out.println("City: " + city);
		addNum(11, 4);// Change + sign for comma
	}

	int addNum(int a, int b) {// remove semicolon

		int result;

		result = a + b;// Misspelling result

		return result;// Change result to int
	}

	public void setAge(int i) {
		// TODO Auto-generated method stub
		
	}

}
