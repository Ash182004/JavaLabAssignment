package com.training.day2;
import com.training.day2.Employee;

public class CommissionEmployee extends Employee {
	private double totalSales;
    private double commissionRate;

    public CommissionEmployee(String name, int id, double totalSales, double commissionRate) {
        super(name, id);
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPayment() {
        return (commissionRate * totalSales) / 100;
    }

}
