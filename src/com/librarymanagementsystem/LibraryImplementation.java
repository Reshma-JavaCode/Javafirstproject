package com.librarymanagementsystem;

import java.util.Scanner;

public class LibraryImplementation implements Library {

	Book[] b = new Book[10];
	int index = 0;
	Scanner sc = new Scanner(System.in);

	@Override
	public void addBook(Book obj) {

		if (index < b.length) {
			b[index] = obj;
			index++;
		} else {
			System.out.println("Library is Full");
		}

	}

	@Override
	public void deleteBook(int bid) {//1 2 3 4 // 1 3 4

		for(int i=0;i<index;i++)
		{
			System.out.println("Book Name: "+b[i].getBookName());
			if(b[i].getBookId()==bid)
			{
				for(int j=i;j<index-1;j++)
				{
					
					b[j]=b[j+1];
					
				}
				b[index-1]=null;
				index--;	
				System.out.println("Deleted succesully");
				return;
			}
			
		}
		System.out.println("Invalid Book Id!!!");
		
	}

	@Override
	public void getBookById(int bid) {

		for (int i = 0; i < index; i++) {
			if (b[i].getBookId() == bid) {
				System.out.println("Book found");
				b[i].displayBooks();
				return;
			}
		}
		System.out.println("Invalid Book Id!!");

	}

	@Override
	public void updateBook(int bid) {

		for (int i = 0; i < index; i++) {
			if (b[i].getBookId() == bid) {

				System.out.println("enter book name:");
				//sc.nextLine();
				String bname = sc.nextLine();
				b[i].setBookName(bname);
				System.out.println("enter author name:");
				String author = sc.nextLine();
				b[i].setBookAuthor(author);
				System.out.println("Enter cost:");
				double price = sc.nextDouble();
				b[i].setBookPrice(price);
				System.out.println("Enter cat:");
				sc.nextLine();
				String category = sc.nextLine();
				b[i].setBookCategory(category);
				System.out.println("Updated Succ");
				return;
			}
		}
		System.out.println("Invaid Book Id!!");

	}

	@Override
	public void displayAllBooks() {

		for (int i = 0; i < index; i++) {
			b[i].displayBooks();
		}

	}

}
