package com.training.day1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2_Attempt3GradeAverageCalculator {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of students: ");
	int n = sc.nextInt();
	int[] grades = new int[n];
	
	double sum = 0;
	int count = 0;
	
	while(count < n) {
		System.out.println("Enter grade: ");
		
		try {
			int grade = sc.nextInt();
			if(grade <= 100 && grade >= 0) {
				grades[count] = grade;
				sum += grades[count];
				count++;
			}
			else {
				System.out.println("Imvalid grade. Try again.");
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("enter the integer");
			sc.next();
		}
	
	
		
	}
	System.out.println("Average is: " + sum/n);
	sc.close();
}
}
