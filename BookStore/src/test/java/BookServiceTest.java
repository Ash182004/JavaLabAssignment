

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookStore.Dao.Book;
import com.bookStore.Dao.BookDao;
import com.bookStore.Dao.DaoException;
import com.bookStore.Service.BookService;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
	private static final Logger logger = LogManager.getLogger(BookService.class);

	@Mock
	private BookDao mockBookDao;
	
	@InjectMocks
	private BookService bookService;
	
	@BeforeAll
	public void before() {
		System.out.println("Starting testing with JUnit + Mockito.");
    }
	// Positive test
	@Test
	void addBookTest() throws DaoException {
		logger.info("Testing positive add book test");
		Book book = new Book("1244_XX", "JUNIT book", "Some Author", 200);
		when(mockBookDao.addBook(book)).thenReturn(book);
		
		Book result = bookService.addBook(book);
		assertEquals("JUNIT book", result.getTitle());
		verify(mockBookDao, times(1)).addBook(book);
	}
	// Negative tsts
	@Test
	void addBookInValidPrice() {
		logger.info("Testing negative(invalid price) add book test");
		Book book = new Book("1244_XX", "JUNIT book", "Some Author", -20);
		IllegalArgumentException thrown = assertThrows(
				IllegalArgumentException.class, () -> bookService.addBook(book)
				);
	}
	@Test
	void addBookInvalidTitle() throws DaoException {
		logger.info("Testing negative(e,pty title) add book test");
		Book book = new Book("1244_XX", "", "Some Author", 200);
		IllegalArgumentException thrown = assertThrows(
				IllegalArgumentException.class, () -> bookService.addBook(book)
				);
		assertEquals("Book title cannot be empty", thrown.getMessage());
	    verify(mockBookDao, never()).addBook(any());
	}
	@Test
	void getBookByIdTest() throws DaoException {
		logger.info("Testing positive get book test");
		Book book = new Book("1243abhd", "JUNIT book", "Some Author", 200);
		book.setId(20);
		when(mockBookDao.getBookById(20)).thenReturn(book);
		Book res= bookService.getBookById(20);
		assertEquals(20, res.getTitle());
	}
	@Test
	void getBookByInvalidIdTest() throws DaoException {
		logger.info("Testing negative get book test");
		when(mockBookDao.getBookById(-20)).thenReturn(null);
		Book res= bookService.getBookById(-20);
		assertNull(res);
	}
	@Test
	void updateBookTest() throws DaoException{
		logger.info("Testing positive update book test");
		Book book = new Book("1244_XX", "JUNIT book", "Some Author", -20);
		IllegalArgumentException thrown = assertThrows(
				IllegalArgumentException.class, ()-> bookService.updateBook(1, book)
				);
		assertEquals("Book price must be greater than zero", thrown.getMessage());
	    verify(mockBookDao, never()).updateBook(anyInt(), any());
	}
	@Test
	void deleteBookTest() throws DaoException {
		logger.info("Testing negative delete book test");
		int id = 1;
		doNothing().when(mockBookDao).deleteBook(id);
		bookService.deleteBook(id);
		verify(mockBookDao, times(1)).deleteBook(id);
	}
}
