package com.librarymanagementsystem;

public interface Library {

	void addBook(Book obj);
	void deleteBook(int bid);
	void getBookById(int bid);
	void updateBook(int bid);
	void displayAllBooks();
	
	
}
