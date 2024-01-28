package com.noorteck.java.day17;

public class Movie2 {
	String title;
	String director;
	int releaseYear;
	String language;
	String country;
	String mainActor;
	String category;
	String rating;
	
	public Movie2(String title, String director, int releaseYear, String language, String Country, String mainActor, String category, String rating) {
		this.title=title;
		this.director=director;
		this.releaseYear=releaseYear;
		this.language=language;
		this.country=country;
		this.mainActor=mainActor;
		this.category=category;
		this.rating=rating;
	}
	
	public static void main(String[] args) {
		Movie2 m1= new Movie2("Java","Director",2023,"English","USA","MAIN JAVA","SC FICTION","5 Star");
		Movie2 m2= new Movie2("Java","Director",2023,"English","USA","MAIN JAVA","SC FICTION","5 Star");
		Movie2 m3= new Movie2("Java","Director",2023,"English","USA","MAIN JAVA","SC FICTION","5 Star");
		System.out.println(m1.title);
		System.out.println(m1.director);
		System.out.println(m1.releaseYear);
		System.out.println(m1.language);
		System.out.println(m1.country);
		System.out.println(m1.mainActor);
		System.out.println(m1.category);
		System.out.println(m1.rating);
		
	}

}


