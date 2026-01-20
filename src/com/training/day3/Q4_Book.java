package com.training.day3;

public class Q4_Book {
	private int id;
    private String isbn;
    private String title;
    private String author;
    private double price;
    private int quantity;

    public Q4_Book(int id, String isbn, String title, String author, double price) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = 10; // default stock
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return id + " | " + isbn + " | " + title + " | " + author +
               " | Price: " + price + " | Qty: " + quantity;
    }

}
