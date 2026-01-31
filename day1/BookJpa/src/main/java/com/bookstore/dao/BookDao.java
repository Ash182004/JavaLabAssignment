package com.bookstore.dao;


import java.util.List;
import com.bookstore.dto.Book;

public interface BookDao {
    public List<Book> getAllBooks();
    public Book addBook(Book book);
    public void deleteBook(int id);
    public void updateBook(int id, Book book);
    public Book getBookById(int id);
}