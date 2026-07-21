package com.librarymanagementsystem;

import java.util.Scanner;

public class LibraryManagement {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Library l=new LibraryImplementation();
		boolean status=true;
		
		System.out.println("******** Library Management System ************");
		while(status)
		{
			System.out.println("\nEnter Your Choice:");
			System.out.println("1.Add Books\n2.Display all books\n3.Update books by book id");
			System.out.println("4.Get book by book id\n5.Delete book by book id\n6.Exit");
			int ch= sc.nextInt();
			System.out.println();
			
			switch(ch)
			{
			case 1->
			{
				System.out.println("enter book id: ");
				int bid= sc.nextInt();
				
				System.out.println("enter book name:");
				 sc.nextLine(); // consume newline
				String bname=sc.nextLine();
				System.out.println("enter author name:");
				String author=sc.nextLine();
				System.out.println("Enter cost:");
				double price= sc.nextDouble();
				System.out.println("Enter cat:");
				 sc.nextLine(); // consume newline
				String cat=sc.nextLine();
				
				Book b= new Book(bid,bname,author,price,cat);
				l.addBook(b);
				
			}
			case 2->
			{
				l.displayAllBooks();
			
			}
			case 3->{
				
				System.out.println("enter Book id:");
				int bid=sc.nextInt();
				l.updateBook(bid);
				
			}
			case 4->
			{
				System.out.println("enter Book id:");
				int bid=sc.nextInt();
				l.getBookById(bid);
			}
			case 5->
			{
				System.out.println("enter Book id:");
				int bid=sc.nextInt();
				l.deleteBook(bid);
			}
			case 6->{
				status=false;
				System.out.println("Thank you for using Library Management System.");
				//break;
			}
			default -> System.out.println("Invalid Choice. Please try again.");
		}
		}
	}

}
