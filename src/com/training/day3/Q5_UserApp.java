package com.training.day3;
import com.training.day3.Q5_InvalidCountryException;
import com.training.day3.Q5_UserRegistration;

public class Q5_UserApp {
	public static void main(String[] args) {
		Q5_UserRegistration ur = new Q5_UserRegistration();

	        // ✅ Valid case
	        try {
	            ur.registerUser("Ashmita", "India");
	        } catch (Q5_InvalidCountryException e) {
	            System.out.println(e.getMessage());
	        }

	        // ❌ Invalid case
	        try {
	            ur.registerUser("John", "USA");
	        } catch (Q5_InvalidCountryException e) {
	            System.out.println(e.getMessage());
	        }
	}

}
