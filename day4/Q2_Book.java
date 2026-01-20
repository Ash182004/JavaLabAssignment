package com.training.day4;

import java.util.Objects;

public class Q2_Book {
	String title;
    String author;
    double price;

    // Constructor
    public Q2_Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

   
    @Override
    public String toString() {
        return title + " – " + author;
    }

    // Two books are equal if title and author are same
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Q2_Book other = (Q2_Book) obj;
        return title.equals(other.title) && author.equals(other.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
