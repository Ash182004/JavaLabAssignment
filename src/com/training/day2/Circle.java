package com.training.day2;
import java.util.Scanner;


public class Circle {
	
		private double radius;
		private String color;
		
		public Circle(){
			radius=1.0;
			color="red";
		}
		
		public Circle(double r) {
			radius=r;
			color="red";
		}
		public Circle(double r,String c) {
			radius=r;
			color=c;
		}
		
		public double getRadius(){
			return radius;
		}
		
		public String getColor() {
			return color;
		}
		public double getArea() {
			return Math.PI*radius*radius;
		}
		
		public double getCircumference() {
			return 2*Math.PI*radius;
		}
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the radius");
			double radius=sc.nextDouble();
			System.out.println("enter the color");
			String color=sc.next();
			sc.close();
			Circle myCircle=new Circle(radius,color);
			System.out.println(myCircle.getArea());
			System.out.println(myCircle.getCircumference());
			
			
			
			
		}
		
	
	

}
