package com.training.day2;

public class Accounts {
	protected String name;
    protected String accountNumber;
    protected double accountBalance;

   
    public Accounts(String name, String accountNumber, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

  
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    
    public void withdraw(double amount) {
        System.out.println("it needs to be overriden");
    }

   
    public double getAccountBalance() {
        return accountBalance;
    }

}
