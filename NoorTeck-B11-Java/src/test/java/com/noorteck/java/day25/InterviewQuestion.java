package com.noorteck.java.day25;

public class InterviewQuestion {
	
	public static void main(String[]args) {
		InterviewQuestion obj = new InterviewQuestion();
		
		String str = "Madam";
		String str1 = "rececar";
		String str2 = "Radar";
		String str3 = "kayak";
		String str4 = "Fun";
		String str5 = "Elle";
		
		 System.out.println(obj.isPalindrome(str));
		 System.out.println(obj.isPalindrome(str1));
		 System.out.println(obj.isPalindrome(str2));
		 System.out.println(obj.isPalindrome(str3));
		 System.out.println(obj.isPalindrome(str4));
		 System.out.println(obj.isPalindrome(str5));
		 
		
	}
	
	protected boolean isPalindrome(String str) {
		boolean result = false;
		
		 int left = 0;
		 int right = str.length() - 1;
		    while (left < right && result) {
		        if (str.charAt(left) != str.charAt(right)) {
		            result = true;
		        }
		        right--;
		        left++;
		    }
		   
		
		return result;
		
		
	}

}
