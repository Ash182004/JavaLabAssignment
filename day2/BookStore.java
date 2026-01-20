package com.training.day2;
import com.training.day2.Book;
import java.util.Scanner;

public class BookStore {
	private Book[] books;
	private int count;
	
	public BookStore() {
		books=new Book[10];
		count=0;
		
	}
	
	public void sell(String title, int qty) {
		for(Book b:books) {
			if(b==null) break;
			if(b.getBookTitle().equalsIgnoreCase(title)) {
				if(b.sellCopies(qty)) {
					System.out.println("sold"+qty+"copies of"+title);
				}else {
					System.out.println("not enough stock");
				}
				return;
				
			}
		}
		System.out.println("Book not found");
	}
	
	public void order(String isbn, int qty) {
		
		for(Book b:books) {
			if(b==null) return;
			if(b.getIsbn().equalsIgnoreCase(isbn)) {
				b.addCopies(qty);
					System.out.println("now book amount of"+isbn+"is"+qty);
					return;
				}
					
				
			}
		if(count<10) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter book title");
			String title=sc.nextLine();
			System.out.println("enter book title");
			String author=sc.nextLine();
			sc.close();

			books[count]=new Book(title,author,isbn,qty);
			count++;
			System.out.println("new book added");
			
		}else {
			System.out.print("its full");
		}
		
	}
	public void display() {
		System.out.println("Book inventory");
		for(Book b:books) {
			if(b==null) break;
		
			b.Display();
		}
	}
	
	

}
