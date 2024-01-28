package com.noorteck.java.day27;

public class BankAccountDemo {
	public static void main(String[]args) {
		
		BankAccount obj1 = new BankAccount(111.11,12.3,"John");
		BankAccount obj2 = new BankAccount(222.22,45.6,"Thomas");
		BankAccount obj3 = new BankAccount(333.33,78.9,"James");
		
		obj1.setAccBalance(111.11);
		obj2.setAccBalance(222.22);
		obj3.setAccBalance(333.33);
		
		obj1.setAccNumber(12.3);
		obj2.setAccNumber(45.6);
		obj3.setAccNumber(78.9);
		
		obj1.setAccOwner("John");
		obj2.setAccOwner("Thomas");
		obj3.setAccOwner("James");
		
		obj1.deposit(200.00);
		obj2.deposit(300.00);
		obj3.deposit(400.00);
		
		obj1.withdraw(100.00);
		obj2.withdraw(200.00);
		obj3.withdraw(300.00);
		
		
		
		
		
		System.out.println("Current Balance:$ "+ obj1.getAccBalance());
		System.out.println("Current Balance:$ "+ obj2.getAccBalance());
		System.out.println("Current Balance:$ "+ obj3.getAccBalance());
		
		System.out.println("Account Number: "+ obj1.getAccNumber());
		System.out.println("Account Number: "+ obj2.getAccNumber());
		System.out.println("Account Number: "+ obj3.getAccNumber());
		
		System.out.println("Account Owner: "+ obj1.getAccOwner());
		System.out.println("Account Owner: "+ obj2.getAccOwner());
		System.out.println("Account Owner: "+ obj3.getAccOwner());
		
		
	}

}
