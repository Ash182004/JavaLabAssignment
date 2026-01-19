package com.training.day2;
import com.training.day2.Employee;

public class Invoice  implements Payable {
	  private int invoiceId;
	    private String itemDescription;
	    private int quantity;
	    private double pricePerUnit;

	    public Invoice(int invoiceId, String item, int quantity, double price) {
	        this.invoiceId = invoiceId;
	        this.itemDescription = item;
	        this.quantity = quantity;
	        this.pricePerUnit = price;
	    }

	    @Override
	    public double getPayment() {
	        return quantity * pricePerUnit;
	    }

}
