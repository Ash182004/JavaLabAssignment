package com.training.day2;
import com.training.day2.Accounts;
public class currentAccount extends Accounts {
	private String tradeLicenseNumber;
	private double overdraft;
	
	public currentAccount(String name, String accountNumber, double balance,String
			tradeLicenseNumber, double overdraft){
		super(name,accountNumber,balance);
		this.tradeLicenseNumber=tradeLicenseNumber;
		this.overdraft=overdraft;
	}
    public String getTadeLicenseNumber() {
    	return tradeLicenseNumber;
    }
	public double getBalance() {
		return accountBalance;
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("invalid withdrawl amount");
			return;
		}
		if(amount<=accountBalance+overdraft) {
			accountBalance-=amount;
			System.out.println("withdrawl successful"+amount);
			if(accountBalance<0) {
				System.out.println("your account is in overdraft by"+(-accountBalance));
			}
		}else {
			System.out.println("withdrawl exceeds ovedraft limit");
		}
	}
}
