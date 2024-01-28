package com.noorteck.java.day6;

public class HWexercise2 {
	public static void main(String args[]) {
		String brand = "Facebook";
		String slogan = "";
		boolean isSloganFound = true;
		switch (brand) {
		case "Nike":
			slogan = "Just Do It";
			break;
		case "Adidas":
			slogan = "Imposible is Nothing";
			break;
		case "Puma":
			slogan = "Forever Faster";
			break;
		case "Reebok":
			slogan = "I am what I am";
			break;
		default:
			slogan = "Not Found";
			isSloganFound = false;

		}
		if (isSloganFound == true) {
			System.out.println(brand + "'s slogan is " + " " + slogan);

		} else {
			System.out.println(brand + "'s slogan " + " " + "Not Found" + ".This message suppooses to give hard time");

		}

	}

}
