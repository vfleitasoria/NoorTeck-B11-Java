package com.noorteck.java.day17;

public class Movie {
	String title;
	String director;
	int releaseYear;
	String language;
	String country;
	String mainActor;
	String category;
	String rating;
	
	public Movie(String movTit, String movDir, int movYear, String movLang, String movCountry, String movActor, String movCat, String movRating) {
		title=movTit;
		director=movDir;
		releaseYear=movYear;
		language=movLang;
		country=movCountry;
		mainActor=movActor;
		category=movCat;
		rating=movRating;
	}
	
	public static void main(String[] args) {
		Movie m1= new Movie("Java","Director",2023,"English","USA","MAIN JAVA","SC FICTION","5 Star");
		Movie m2= new Movie("Java","Director",2023,"English","USA","MAIN JAVA","SC FICTION","5 Star");
		Movie m3= new Movie("Java","Director",2023,"English","USA","MAIN JAVA","SC FICTION","5 Star");
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
