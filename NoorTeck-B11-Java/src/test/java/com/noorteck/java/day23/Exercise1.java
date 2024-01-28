package com.noorteck.java.day23;

public class Exercise1 {
	public static void main(String[] args) {

		String names[] = { "Ahmed", "Alex", "Ruby", "Luke", "Vladimir", "Yasmine", "Haithem" };

		for (int i = 0; i < names.length; i++) {
			String n = names[i];

		if (n.length() == 4) {

			System.out.println(n.toUpperCase());
		} else if (n.length() == 5) {
			System.out.println(n.toLowerCase());
		} else if (n.length() > 6 && n.length() < 8) {
			System.out.println(n.substring(0, 3));
		} else {
			System.out.println(n);
		}
		}
	}
}
	


