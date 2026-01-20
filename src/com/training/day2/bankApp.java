package com.training.day2;
import com.training.day2.savingAccount;
import com.training.day2.Accounts;
import com.training.day2.currentAccount;
public class bankApp {
public static void main(String[] args) {
	  savingAccount sa = new savingAccount("Ashmita", "ACC101", 10000);

      System.out.println("Balance with interest: " + sa.getBalance());

      sa.withdraw(3000);  
      System.out.println("Balance after withdrawal: " + sa.getAccountBalance());

      sa.withdraw(3000);   

      sa.deposit(2000);
      System.out.println("Final Balance: " + sa.getAccountBalance());
      
      System.out.println("------------------------------------------------");
      
      currentAccount ca=new currentAccount("Ravi", "CUR201",20000,"tyu993",10000);
      System.out.println("curent balane is"+ca.getBalance());
      ca.deposit(200000);
      ca.withdraw(2500);
      ca.withdraw(1000000);
      System.out.println("current one"+ca.getBalance());
      
      
}
}
