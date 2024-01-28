package com.noorteck.java.day27;

public class BankAccount {

	private double accBalance;
	private double accNumber;
	private String accOwner;

	public BankAccount(double accBalance, double accNumber, String accOwner) {
		this.accBalance = accBalance;
		this.accNumber = accNumber;
		this.accOwner = accOwner;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccNumber(double accNumber) {
		this.accNumber = accNumber;
	}

	public double getAccNumber() {
		return accNumber;
	}

	public void setAccOwner(String accOwner) {
		this.accOwner = accOwner;
	}

	public String getAccOwner() {
		return accOwner;
	}

	public void deposit(double amount) {

		accBalance = amount + accBalance;
	}

	public void deposit2(double amount) {
		this.accBalance = this.accBalance + accBalance;
	}

	public boolean withdraw(double amount) {
		boolean result = false;

		if (accBalance >= amount) {
			accBalance = accBalance - amount;
			return true;

		} else {
			return false;

		}

	}

}
