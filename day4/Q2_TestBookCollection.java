package com.training.day4;

public class Q2_TestBookCollection {
public static void main(String[] args) {
	 Q2_Book[] books = {
	            new Q2_Book("Java Basics", "Raj", 450),
	            new Q2_Book("Spring Boot", "Sharma", 650),
	            new Q2_Book("Java in Depth", "Mehta", 550)
	        };

	        Q2_BookCollection collection =
	                new Q2_BookCollection("Rajeev Gupta", books);

	        Q2_Book searchBook = new Q2_Book("Java in Depth", "Mehta", 0);

	        System.out.println("Has Java in Depth? " +
	                collection.hasBook(searchBook));

	        collection.sort();

	        System.out.println("\nFinal Sorted Collection:");
	        System.out.println(collection);
	
}
}
