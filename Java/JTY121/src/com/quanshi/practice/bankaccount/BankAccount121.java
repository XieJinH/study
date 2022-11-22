package com.quanshi.practice.bankaccount;

public class BankAccount121 {
	// member
	private String name;
	
	private String id;
	
	private double balance = 500;
	
	// getter
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	// withdrawal balance
	public void withdrawalBalance(double withdrawalBalance) {
		if (withdrawalBalance > balance) {
			System.out.println("System Error!");
		} else {
			balance -= withdrawalBalance;
			
			System.out.println("The withdrawal is successful! System will be returned soon.");
		}
	}
	
	// deposit balance
	public void depositBalance(double depositBalance) {
		balance += depositBalance;
		
		System.out.println("Deposit success! System will be returned soon.");
	}
	
	// print balance
	public void printBalance() {
		System.out.println("Your balance is " + balance);
	}
		
	// constructor
	public BankAccount121() { }
	
	public BankAccount121(String name, String id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}

	public BankAccount121(BankAccount121 account) {
		this.name = account.name;
		this.id = account.id;
		this.balance = account.balance;
	}
	
	public static void main(String[] args) {
		BankAccount121 myAccount = new BankAccount121();
		
		myAccount.setName("York");
		myAccount.setId("211308121");
		
		myAccount.depositBalance(500);
		myAccount.withdrawalBalance(10000);
		myAccount.withdrawalBalance(100);
		
		myAccount.printBalance();
	}
}