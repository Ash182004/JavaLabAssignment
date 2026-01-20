package com.training.day1;
import java.time.LocalDate;
import java.util.Scanner;

public class Q7_nextDateComparisonUsingLocalDate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date");
		int date=sc.nextInt();
		System.out.println("enter the year");
		int year=sc.nextInt();
		System.out.println("enter the month");
		int month=sc.nextInt();
		sc.close();
		
		try {
			LocaDate daten=LocalDate.of(year,month,day);
			LocalDate nextDate=daten.plusDays(1);
			System.out.println("new date is"+nextDate);
			
		}catch(Exception e) {
			System.out.println("invalid date entered");
		}
	}

}
