package com.training.day1;
import  java.util.Scanner;
import com.training.day1.LeapYear;


public class Q5_Attempt1NextDateCalculator {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the day:");
		int day=in.nextInt();
		System.out.println("enter the month:");
		int month=in.nextInt();
		System.out.println("enter the year:");
		int year=in.nextInt();
		
		in.close();
		
	    int[] DaysInMonth= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(LeapYear.isLeapYear(year)) {
			DaysInMonth[1]=29;
		}
		
		day++;
		if(day>DaysInMonth[month-1]) {
			day=1;
			month++;
			if(month>12) {
				month=1;
				year++;
			}
		}
		System.out.println("the next date is:"+day+" "+month+" "+year);
	}

}
