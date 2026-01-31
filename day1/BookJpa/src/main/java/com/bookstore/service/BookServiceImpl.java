package com.bookstore.service;
import java.util.List;

import com.bookstore.dao.BookDao;
import com.bookstore.dao.BookDaoJdbcImpl;
import com.bookstore.dto.Book;
import com.bookstore.exceptions.DaoException;
import com.bookstore.exceptions.InvalidBookException;
import com.bookstore.exceptions.ServiceException;

public class BookServiceImpl implements BookService {
	private BookDao bookdao;
	
	public BookServiceImpl(BookDao bookdao) {
		this.bookdao = bookdao;
	}

	@Override
	public List<Book> getAllBooks() {
		try {
			return bookdao.getAllBooks();
		} catch(DaoException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		
	}

	@Override
	public Book addBook(Book book) {
		try {
			BookValidation.validate(book);
			return bookdao.addBook(book);
		} catch(InvalidBookException e) {
			throw new ServiceException(e.getMessage(), e);
		} catch(DaoException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		
	}

	@Override
	public void deleteBook(int id) {
		try{
			bookdao.deleteBook(id);
		} catch(DaoException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		
	}

	@Override
	public void updateBook(int id, Book book) {
		try{
			BookValidation.validate(book);
			bookdao.updateBook(id, book);
		} catch(InvalidBookException e) {
			throw new ServiceException(e.getMessage(), e);
		} catch(DaoException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

	@Override
	public Book getBookById(int id) {
		try {
			return bookdao.getBookById(id);
		} catch(DaoException e) {
			throw new ServiceException(e.getMessage(), e);
		}

	}

}