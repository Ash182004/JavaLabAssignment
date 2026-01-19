package com.training.day2;
import com.training.day2.Book;
import com.training.day2.BookStore;
public class BookStoreApp {
	public static void main(String[] args) {
		BookStore store=new BookStore();
		store.order("ISBN991", 5);
		store.order("ISBN961", 1);
		store.order("ISBN661", 1);
		
		store.display();
		System.out.println();
		
		store.order("ISBN991", 2);
		store.display();
		System.out.println();
		
		store.sell("java basics", 2);
		System.out.println();
		store.display();
		
	}

}
