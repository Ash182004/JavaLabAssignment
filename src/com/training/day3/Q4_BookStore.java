package com.training.day3;
import com.training.day3.Q4_Book;
import com.training.day3.Q4_NotSufficientBookException;

import java.util.LinkedList;

public class Q4_BookStore {
	private LinkedList<Q4_Book> books = new LinkedList<>();

    public void addBook(Q4_Book book) {
        books.add(book);
    }

   
    public Q4_Book searchBook(int id) {
        for (Q4_Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    // 📉 Sell Book
    public void sellBook(String isbn, int noOfCopies)
            throws Q4_NotSufficientBookException {

        for (Q4_Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                if (b.getQuantity() >= noOfCopies) {
                    b.setQuantity(b.getQuantity() - noOfCopies);
                    System.out.println("Book sold successfully!");
                    return;
                } else {
                    throw new Q4_NotSufficientBookException("Not enough copies available");
                }
            }
        }
        System.out.println("Book not found");
    }


  
    public void purchaseBook(String isbn, int noOfCopies) {
        for (Q4_Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                b.setQuantity(b.getQuantity() + noOfCopies);
                System.out.println("Book purchased successfully!");
                return;
            }
        }
        System.out.println("Book not found");
    }

   
    public void displayBooks() {
        for (Q4_Book b : books) {
            System.out.println(b);
        }
    }

}
