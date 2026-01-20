package com.training.day2;

public class Book {
    private String bookTitle;
    private String author;
    private String ISBN;
    private int numOfCopies;
    
    public Book(String bookTitle,String author,String ISBN,int numOfCopies) {
    	this.bookTitle=bookTitle;
    	this.author=author;
    	this.ISBN=ISBN;
    	setNumOfCopies(numOfCopies);
    }
    public int getNumOfCopies() {
    	return numOfCopies;
    }
    public void setNumOfCopies(int num) {
    	if(num<0) {
    		System.out.println("enter valid number it should not be negative");
    		this.numOfCopies=0;
    	}else {
    		this.numOfCopies=num;
    	}
    }
    public String getBookTitle(){
    	return bookTitle;
    }
    
    public String getAuthor(){
    	return author;
    }
    public String getIsbn() {
    	return ISBN;
    }
    public void Display() {
    	System.out.println(bookTitle+"-"+author+"-"+ISBN+"-"+numOfCopies);
    }
    public boolean sellCopies(int count) {
    	if(count<=numOfCopies) {
    		numOfCopies-=count;
    		return true;
    	}
    	return false;
    }
    public void addCopies(int count) {
    	if(count>0) {
    		count+=numOfCopies;
    		
    		
    	}
    	
    }
    
}
