package com.training.day1;
import java.util.Scanner;


public class Q2_Attempt1GradeAverageCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n=sc.nextInt();
		int[] grades=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			while(true) {
				System.out.println("enter the grade for"+(i+1)+"student;");
				int grade=sc.nextInt();
				if(grade>=0&&grade<=100) {
					grades[i]=grade;
					sum+=grade;
					break;
				}else {
					System.out.println("invalid grade");
				}
			}
		}
		double average=sum/n;
		System.out.println("avarage is"+ average);
		sc.close();
		
		
	}
}
