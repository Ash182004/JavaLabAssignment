package com.training.day2;
import com.training.day2.Payable;

public class employeePayable implements Payable {
	  private int invoiceId;
	   protected String name;
	   protected int employeeId;
	   
	   public employeePayable(String name,int employeeId) {
		   this.name=name;
		   this.employeeId=employeeId;
	   }

}
