package com.training.day2;
import com.training.day2.Accounts;

public class savingAccount extends Accounts {
	 private final double interest = 5.0;
	    private final double MIN_BALANCE = 5000;

	    // Constructor
	    public savingAccount(String name, String accountNumber, double balance) {
	        super(name, accountNumber, balance);
	    }

	    // Returns balance + interest (DOES NOT MODIFY actual balance)
	    public double getBalance() {
	        return accountBalance + (accountBalance * interest / 100);
	    }

	    // Overridden withdraw method
	    @Override
	    public void withdraw(double amount) {

	        if (amount <= 0) {
	            System.out.println("Invalid withdrawal amount");
	            return;
	        }

	        if (amount > accountBalance) {
	            System.out.println("Withdrawal exceeds maximum limit");
	            return;
	        }

	        if (accountBalance - amount < MIN_BALANCE) {
	            System.out.println("Cannot withdraw. Minimum balance of ₹5000 must be maintained");
	            return;
	        }

	        accountBalance -= amount;
	        System.out.println("Withdrawal successful. Amount withdrawn: " + amount);
	

}}
