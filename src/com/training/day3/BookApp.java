package com.training.day3;

import java.io.BufferedReader;
import java.io.FileReader;

import com.training.day3.Q4_BookStore;
import com.training.day3.Q4_Book;
import com.training.day3.Q4_NotSufficientBookException;

public class BookApp {
	public static void main(String[] args) {
		Q4_BookStore store = new Q4_BookStore();

       
        try (BufferedReader br = new BufferedReader(new FileReader("books.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(":");

                int id = Integer.parseInt(data[0]);
                String isbn = data[1];
                String title = data[2];
                String author = data[3];
                double price = Double.parseDouble(data[4]);

                Q4_Book book = new Q4_Book(id, isbn, title, author, price);
                store.addBook(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

      
        Book found = store.searchBook(121);
        System.out.println(found != null ? found : "Book not found");

     
        try {
            store.sellBook("A234", 3);
        } catch (Q4_NotSufficientBookException e) {
            System.out.println(e.getMessage());
        }

        
        store.purchaseBook("S234", 5);

       
        store.displayBooks();
	}

}
