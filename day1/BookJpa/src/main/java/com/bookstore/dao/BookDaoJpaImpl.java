package com.bookstore.dao;
import java.util.List;

import com.bookstore.dto.Book;
import com.bookstore.exceptions.BookNotFoundException;
import com.bookstore.exceptions.DaoException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class BookDaoJpaImpl implements BookDao{
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BookStore_PU");

	@Override
	public List<Book> getAllBooks() {
		
		try(EntityManager em = emf.createEntityManager()) {
			return em.createQuery("from Book b", Book.class).getResultList();
		} catch(RuntimeException e) {
			throw new DaoException(e.getMessage(), e);
		}
	}

	@Override
	public Book addBook(Book book) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(book);
			tx.commit();
			return book;
		} catch(RuntimeException e) {
			if(tx.isActive()) tx.rollback();
			throw new DaoException(e.getMessage(), e);
		} finally {
			em.close();
		}
	}

	
	@Override
	public void deleteBook(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try{
			Book book = em.find(Book.class, id);
			if(book == null) {
				throw new BookNotFoundException("No Book Found with ID: " + id);
			}
			
			tx.begin();
			em.remove(book);
			tx.commit();
		} catch(BookNotFoundException e) {
			throw new DaoException(e.getMessage(), e);
		} catch(RuntimeException e) {
			if(tx.isActive()) tx.rollback();
			throw new DaoException(e.getMessage(), e);
		} finally {
			em.close();
		}
		
	}

	@Override
	public void updateBook(int id, Book book) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try{
			tx.begin();
			Book existing = em.find(Book.class, id);
            if (existing == null) {
                throw new BookNotFoundException("No Book Found with ID: " + id);
            }
            existing.setAuthor(book.getAuthor());
            existing.setIsbn(book.getIsbn());
            existing.setPrice(book.getPrice());
            existing.setTitle(book.getTitle());
            em.merge(existing);
			tx.commit();
		} catch(BookNotFoundException e) {
			throw new DaoException(e.getMessage(), e);
		} catch(RuntimeException e) {
			if(tx.isActive()) tx.rollback();
			throw new DaoException(e.getMessage(), e);
		} finally {
			em.close();
		}
	}

	@Override
	public Book getBookById(int id) {
		EntityManager em = emf.createEntityManager();
		try{
			Book book = em.find(Book.class, id);
			if (book == null) {
				throw new BookNotFoundException("No Book Found with ID: " + id);
			}
			return book;
			
		} catch(BookNotFoundException e) {
			throw new DaoException(e.getMessage(), e);
		} catch(RuntimeException e) {
			throw new DaoException(e.getMessage(), e);
		}
	}

}