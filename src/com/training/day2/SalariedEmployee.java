package com.training.day2;
import com.training.day2.Employee;

public class SalariedEmployee extends Employee {
	   private double weeklySalary;

	    public SalariedEmployee(String name, int id, double weeklySalary) {
	        super(name, id);
	        this.weeklySalary = weeklySalary;
	    }

	    @Override
	    public double getPayment() {
	        return weeklySalary;
}}
