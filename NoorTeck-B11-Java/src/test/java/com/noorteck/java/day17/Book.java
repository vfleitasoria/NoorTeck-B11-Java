package com.noorteck.java.day17;

public class Book {
	// Instance Variable
	String title;
	String author;
	int pageNum;
	String isbn;
	int publishYear;

	// Parameterized Constructor

	public Book(String title, String author, int pageNum, String isbn, int publishYear) {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pageNum);
		System.out.println(isbn);
		System.out.println(publishYear);
	}

	public static void main(String[] args) {

		Book obj1 = new Book("Moby Dick", "Herman Melville", 652, "935440734X", 2023);
		System.out.println("************************************");
		Book obj2 = new Book("Greates Work of Jules Verne", "Jules Verne", 808, "9354406718", 2022);
		System.out.println("************************************");
		Book obj3 = new Book("Blood on the Moon", "Luke Short", 260, "0843963026", 2010);

	}

}
