package com.training.day1;

public class Q1_Attempt1FibonacciSeriesAndAvgCal {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		System.out.print(a+" "+b+" ");
	    int next=a+b;
	    double sum = a+b;
	    
	    int i=2;
	    while(i<20) {
	    	sum += next;
	    	System.out.print(next+" ");
	    	a=b;
	    	b=next;
	    	next=a+b;
	    	i++;
	    	
	    	
	    }
	    
	    System.out.println("Average is: " + sum/20);
	    
	}
}
