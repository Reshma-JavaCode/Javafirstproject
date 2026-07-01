package com.languagefundamentals.constructor;

public class Movie3 {

	long id;
	String name, hero;
	int rating;

	Movie3() {
		this(101);
	}

	public Movie3(long id) {

		this(id, "SVS");
	}

	public Movie3(long id, String name) {
		this(id, name, "Mahesh");
	}

	public Movie3(long id, String name, String hero) {
		this(id, name, hero, 5);
	}

	public Movie3(long id, String name, String hero, int rating) {

		this.id = id;
		this.name = name;
		this.hero = hero;
		this.rating = rating;
	}

	void display() {
		
		System.out.println("Movie Id: " + id);
		System.out.println("Movie name: " + name);
		System.out.println("Hero name: " + hero);
		System.out.println("Movie rating: " + rating + "\n");
	}

	public static void main(String[] args) {

		Movie3 m1 = new Movie3();
		m1.display();
		
		Movie3 m2 = new Movie3(102);
		m2.display();
		
		Movie3 m4 = new Movie3(103, "Rowdy");
		m4.display();

	}

}
