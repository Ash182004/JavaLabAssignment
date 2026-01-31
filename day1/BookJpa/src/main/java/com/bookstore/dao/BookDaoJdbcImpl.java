package com.bookstore.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.bookstore.dto.Book;
import com.bookstore.exceptions.BookNotFoundException;
import com.bookstore.exceptions.DaoException;
import com.bookstore.util.ConnectionFactory;

public class BookDaoJdbcImpl implements BookDao {
	
	private Connection connection;
	
	public BookDaoJdbcImpl() {
		this.connection = ConnectionFactory.getConnection();
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from books");
			while(rs.next()) {
				books.add(new Book(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getDouble(5)));
			}
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(), e);
		}
		
		return books;
	}

	@Override
	public Book addBook(Book book) {
		try {
			PreparedStatement psmt = connection.prepareStatement(
								"insert into books(isbn, title, author, price) values(?,?,?,?)",
								Statement.RETURN_GENERATED_KEYS);
			psmt.setString(1, book.getIsbn());
			psmt.setString(2, book.getTitle());
			psmt.setString(3, book.getAuthor());
			psmt.setDouble(4, book.getPrice());
			
			psmt.executeUpdate();
			
			ResultSet rs = psmt.getGeneratedKeys();
						
			if (rs.next()) {
				book.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(), e);
		}
		
		return book;
	}

	@Override
	public void deleteBook(int id) {
		try {
			PreparedStatement psmt = connection.prepareStatement(
					"delete from books where id = ?");
			psmt.setInt(1, id);
			
			int noOfRows = psmt.executeUpdate();
			if (noOfRows == 0) {
				throw new BookNotFoundException("No Book Found with ID: " + id);
			}
			
			System.out.println("Book deleted successfully");
		} catch (BookNotFoundException e) {
			throw new DaoException(e.getMessage(), e);
		} catch(SQLException e) {
			throw new DaoException(e.getMessage(), e);
		}
	}

	@Override
	public void updateBook(int id, Book book) {
		try {
			PreparedStatement psmt = connection.prepareStatement(
					"update books set isbn=?, title=?, author=?, price=? where id=?");
			psmt.setString(1, book.getIsbn());
			psmt.setString(2, book.getTitle());
			psmt.setString(3, book.getAuthor());
			psmt.setDouble(4, book.getPrice());
			psmt.setInt(5, id);
			
			int noOfRows = psmt.executeUpdate();
			
			if(noOfRows == 0) {
				throw new BookNotFoundException("No Book Found with ID: " + id);
			}
			
			System.out.println("Books Updated Successfully");
			
			
		} catch (SQLException e) {
			throw new DaoException("Error Accessing Databse", e);
		} catch(BookNotFoundException e) {
			throw new DaoException(e.getMessage(), e);
		}
		
	}

	@Override
	public Book getBookById(int id) {
		Book book = new Book();
		try {
			PreparedStatement psmt = connection.prepareStatement(
					"select * from books where id = ?");
			
			psmt.setInt(1, id);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				book.setId(rs.getInt(1));
				book.setIsbn(rs.getString(2));
				book.setTitle(rs.getString(3));
				book.setAuthor(rs.getString(4));
				book.setPrice(rs.getDouble(5));
				
				return book;
			} else {
				throw new BookNotFoundException("No such Book Found with ID: " + id);
			}
		} catch (SQLException e) {
			throw new DaoException("Error acessing Database", e);
		} catch(BookNotFoundException e) {
			throw new DaoException(e.getMessage(), e);
		}
	}
}