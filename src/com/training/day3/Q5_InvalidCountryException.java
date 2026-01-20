package com.training.day3;

public class Q5_InvalidCountryException extends Exception {
	 public Q5_InvalidCountryException() {
	        super("User outside India cannot be registered");
	    }

	    // Parameterized constructor
	    public Q5_InvalidCountryException(String message) {
	        super(message);
	    }

}
