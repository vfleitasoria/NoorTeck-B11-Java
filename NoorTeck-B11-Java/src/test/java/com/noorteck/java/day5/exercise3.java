package com.noorteck.java.day5;

public class exercise3 {
	public static void main (String args []) {
		int temp = 70;
		String season="";
		String whatImThinking;
		
	    if (temp>=0&&temp<=20){
			season= "Winter";
			whatImThinking="Too could, can't wait for summer";
			
			} else if (temp>=21&&temp<=40){
			season="Fall";
			whatImThinking="Confused, recovering from could";
			
			} else if (temp>= 41&&temp<=60){
			season="Spring";
			whatImThinking="More confused,thinking about winter";
			
			} else if (temp>=60&&temp<=100){
			season="Summer";
			whatImThinking="Too hot, can't wait for winter";
			
			} else {
				season="Wrong Data";
				whatImThinking="Java & Coffee";}
				
				System.out.println (temp);
				System.out.println (season);
				System.out.println (whatImThinking);
		
		
	}

}
