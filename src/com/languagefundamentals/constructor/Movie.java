package com.languagefundamentals.constructor;

public class Movie {

	//instance data
	String hero,director,producer;
	double budget;
	
	public static void main(String[] args) {
		Movie m=new Movie();
		m.disp();
		Movie m1=new Movie("Mahesh Babu",50000000.00);
		m1.disp();
		
		//copy constructor
		//m3,m1 different address
		//Changes in one object usually do not affect the other
		//Used when you want duplicate data but separate objects
		Movie m3=new Movie(m1,"Sukumar","Niharika");
		
		m3.disp();
		
		//reassigning 
		//m4 is  variable not created object to it.since,new keyword creates object
		// m3 and m4 are referring to the same object.
		// we r only copying the reference (address) of m3 into m4.
		//m3,m4 pointing to same adress
		//Changes affect both variables
		//Used when you want another variable to access the same object
		Movie m4=m3; // **copies only the reference
		m4.disp();
	}

	public Movie(Movie m1,String director, String producer) {
		
		hero=m1.hero;
		budget=m1.budget;
		this.director = director;
		this.producer = producer;
	}

	public Movie(String hero,double budget) {
		
		this.hero = hero;
		this.budget=budget;
		
	}

	public Movie() {
		
		System.out.println("Movie details: ");
	}
void disp()
{
	System.out.println("hero: "+hero);
	System.out.println("Director: "+director);
	System.out.println("producer: "+producer);
	System.out.println("Budget: "+budget);
	System.out.println("**********************************");
	
	
}
}
