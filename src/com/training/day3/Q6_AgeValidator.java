package com.training.day3;
import com.training.day3.Q6_InvalidAgeException;
public class Q6_AgeValidator {
	 public void validate(String name, int age)
	            throws Q6_InvalidAgeException {

	        if (age < 18 || age >= 60) {
	            throw new Q6_InvalidAgeException(
	                "Age must be between 18 and 59"
	            );
	        }

	        System.out.println("Name: " + name + ", Age: " + age);
	    }

}
