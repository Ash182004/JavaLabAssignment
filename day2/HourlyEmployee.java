package com.training.day2;
import com.training.day2.Employee;

public class HourlyEmployee extends Employee {
	private int hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPayment() {
        return hoursWorked * hourlyRate;
    }

}
