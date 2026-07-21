package com.librarymanagementsystem;

public class Book {

	
	int bookId;
	String bookName;
	String bookAuthor;
	double bookPrice;
	String bookCategory;
	
	public Book(int bookId, String bookName, String bookAuthor, double bookPrice, String bookCategory) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookCategory = bookCategory;
	}
	
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public void displayBooks()
	{
		//System.out.println();
		System.out.println("********** Book Details ************");
		System.out.println("Book id: "+bookId);
		System.out.println("Book name: "+bookName);
		System.out.println("Book Author: "+bookAuthor);
		System.out.println("Book Price: "+bookPrice);
		System.out.println("Book category: "+bookCategory);
		System.out.println("************************************");
	}
}
