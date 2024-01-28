package com.noorteck.java.day25;

public class Exercise4 {
	public static void main (String[]args) {
		
		
		Exercise4 obj = new Exercise4();
		int num[]= {2,4,6,8,45,23,23,-34,888,2354,2,12,65,4};
		obj.getMaxMin(num);
		
	}
	
	void getMaxMin(int [] num) {
		
		
	int maxNum=0;
	int minNum=0;
	
		
		 for(int i = 0;i<num.length;i++) {
            if (num[i]>maxNum) {
            	maxNum=num[i];
            }else if (num[i]<minNum) {
            	minNum=num[i];
            }
            }
            System.out.println("Max:  "+maxNum + " Min:  "+minNum);
           
            }
		
		
	}



