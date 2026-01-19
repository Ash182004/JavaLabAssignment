package com.training.day3;
import com.training.day3.Q5_InvalidCountryException;

public class Q5_UserRegistration {
	 public void registerUser(String username, String userCountry)
	            throws Q5_InvalidCountryException {

	        if (!userCountry.equalsIgnoreCase("India")) {
	            throw new Q5_InvalidCountryException(
	                "User " + username + " is not from India"
	            );
	        }

	        System.out.println("User registration done successfully");
	    }

}
