package com.bookstore.controller;
import java.util.List;

import com.bookstore.dao.BookDao;
import com.bookstore.dao.BookDaoJpaImpl;
import com.bookstore.dto.Book;
import com.bookstore.exceptions.ServiceException;
import com.bookstore.service.BookServiceImpl;
import com.bookstore.service.BookService;


public class BookStoreController {
	public static void main(String[] args) {
		BookDao bookDao = new BookDaoJpaImpl();
		BookService bookservice = new BookServiceImpl(bookDao);
		try {
			List<Book> allBooks = bookservice.getAllBooks();
			allBooks.forEach(b->System.out.println(b));
			
			Book addedBook = bookservice.addBook(new Book("9781491950340", "test-book-title", "test-author",
													500.5));
		
			System.out.println(addedBook);
			addedBook.setPrice(9999.0);
			bookservice.updateBook(addedBook.getId(), addedBook);
			
			bookservice.deleteBook(addedBook.getId());
			Book book = bookservice.getBookById(2);
			System.out.println(book);
		} catch(ServiceException e) {
			System.out.println("Operation Failed");
			e.printStackTrace();
		}

	}
}
