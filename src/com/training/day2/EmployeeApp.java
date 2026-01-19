package com.training.day2;
import java.util.ArrayList;
public class EmployeeApp {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new SalariedEmployee("Ashmita", 101, 15000));
        employees.add(new HourlyEmployee("Ravi", 102, 40, 300));
        employees.add(new CommissionEmployee("Neha", 103, 50000, 10));

        for (Employee e : employees) {
            System.out.println(
                "Employee ID: " + e.employeeId +
                ", Name: " + e.name +
                ", Weekly Pay: ₹" + e.getPayment()
            );
        }
	}

}
