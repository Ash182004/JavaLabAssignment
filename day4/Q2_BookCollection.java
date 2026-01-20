package com.training.day4;

import java.util.Arrays;
import java.util.Comparator;

public class Q2_BookCollection {
	 String ownerName;
	    Q2_Book[] books;

	    // Constructor
	    public Q2_BookCollection(String ownerName, Q2_Book[] books) {
	        this.ownerName = ownerName;
	        this.books = books;
	    }

	    // Check if book already exists
	    public boolean hasBook(Q2_Book b) {
	        for (Q2_Book book : books) {
	            if (book.equals(b)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    
	    public void sort() {
	        Arrays.sort(books, new Comparator<Q2_Book>() {
	            @Override
	            public int compare(Q2_Book b1, Q2_Book b2) {

	                int titleCompare = b1.title.compareTo(b2.title);

	                if (titleCompare != 0) {
	                    return titleCompare; // sort by title
	                }

	                // If titles are same, sort by author
	                return b1.author.compareTo(b2.author);
	            }
	        });
	    }

	   
	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("Owner: ").append(ownerName).append("\n");
	        sb.append("Books:\n");

	        for (Q2_Book book : books) {
	            sb.append(book).append("\n");
	        }

	        return sb.toString();

}}
