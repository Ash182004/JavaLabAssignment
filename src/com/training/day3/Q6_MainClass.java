package com.training.day3;
import com.training.day3.Q6_InvalidAgeException;
import com.training.day3.Q6_AgeValidator;
import java.util.Scanner;
public class Q6_MainClass {
	public static void main(String[] args) {
		 try {
			   Scanner sc=new Scanner(System.in);
			    
	            String name = args[0];
	            int age = Integer.parseInt(args[1]);

	            Q6_AgeValidator validator = new Q6_AgeValidator();
	            validator.validate(name, age);

	        } catch (Q6_InvalidAgeException e) {
	            System.out.println("InvalidAgeException: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Please enter valid inputs");
	        }
	}

}
