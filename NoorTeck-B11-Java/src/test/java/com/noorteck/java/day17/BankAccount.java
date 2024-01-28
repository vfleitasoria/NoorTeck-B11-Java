package com.noorteck.java.day17;

public class BankAccount {
	int accountNumber;
	String accountHolderName;
	double balance;

	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
		public void deposit(double amount) {
			balance=balance+amount;
		}
		public void withdraw(double amount) {
			if(amount>balance) {
				System.out.println("Can not withdraw not enough $$$$");
				
			}
		}
			
	
		public static void main(String[]args) {
			BankAccount checking = new BankAccount(12345,"John",500.0);
			System.out.println("Current Balance: $"+checking.balance);
				
			
		}

	}
/**Instructions:

1. Create a class called BankAccount
2. Create instance variable 
	a. accountNumber int type
	b. accountHolderName String type
	c. balance double type

3. Create a constructor for the BankAccount class that takes in 3 arguments, 
		accountNumber, accountHolderName, and balance and set these fields


4. Create a method called deposit that takes in an amount and adds it to the balance.


5. Create a method called withdraw that takes in an amount 
		and subtracts it from the balance 
		and ensure that the balance should not be negative after withdrawal

6. Create a method called checkBalance that returns the current balance of the account


7. Create a main method that demonstrates
		 how the class can be used 
			 > to create a bank account, 
			 > deposit money, 
			 > withdraw money and 
			 > check the balance.
*/
