package com.noorteck.java.day9;

public class PhoneService {
	public static void main(String args[]) {
		
		int minutes=500;
		int message=1000;
		int data=3;
		String planType="";
		double cost=0.0;
		if (minutes < 500 && message==0 && data==0) {
			cost=  40.0;
					planType="Plan A";
			}else if (minutes >= 500 && message<0 && data==0) {
			cost=40.0;
			planType="Plan B";
			}else if (minutes < 500 && message>=100 && data==0){
			cost=60.0;
			planType="Plan C";
			}else if (minutes >= 500 && message>=100 && data==0) {
				cost=70.0;
				planType="Plan D";
			}else if (minutes >= 500 && message>=100 && data<3) {
				cost=80.0;
				planType="Plan E";
			}else if (minutes >= 500 && message>=100 && data>=3) {
				cost=90.0;
				planType="Plan F";
			}else {
				System.out.println("SYSTEM ERROR...");}
		System.out.println("You should buy "+ planType +" wich cost $"+ cost + " per month");
				
				
				
			
					
		}
			//System.out.println("Message UNLIMITED");}
		//else if (data>=3) {
			//System.out.println ("Data UNLIMITED");}
		
		}
		
		
	

/**Write a program for Sprint Phone service. Sprint offers different plans based on customers need for:
• Maximum monthly values for talk minutes used,
• text messages sent, and
• gigabytes of data used

Suppose
• minutes is a variable of type int. The value of minutes can be any number.
• messages is a variable of type int. The value of messages can be any number.
• data is a variable of type int. The value of data can be any number (Assign random number)
• planType is a variable of type String. Set the value of planType to empty String
• cost is a variable of type double. Set the value of cost to 0.0
Life Saver Hints:
• Use if else
• minutes is considered UNLIMITED when the value is 500 or greater
• messages is considered UNLIMITED when the value is 100 or greater
• data is considered UNLIMITED when the value is 3 or greater
*/