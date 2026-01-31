package com.bookstore.service;

import com.bookstore.dto.Book;
import com.bookstore.exceptions.InvalidBookException;

public class BookValidation {
	public static void validate(Book book) {
		if(book == null) {
			throw new InvalidBookException("Book cannot be null");
		}
		
		if(book.getAuthor().isBlank() || book.getIsbn().isBlank() || book.getTitle().isBlank()
			|| book.getPrice() < 0) {
			
			throw new InvalidBookException("Book Attributes are Invalid");
		}
	}
}
