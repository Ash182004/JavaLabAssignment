package com.training.day1;
import java.util.Scanner;


public class Q6_printTriangleUsingStringBuilder {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    System.out.println("enter the number");
		int n=in.nextInt();
		in.close();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				sb.append("*");
				
			}sb.append("\n");
		}
		System.out.print(sb.toString());
		
	}
	
	

}
