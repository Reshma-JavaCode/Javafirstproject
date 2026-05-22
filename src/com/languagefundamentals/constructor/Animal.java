package com.languagefundamentals.constructor;

public class Animal {

	Animal() {
		System.out.println("Animal super class constrctr");
	}

	public static void main(String[] args) {

	}
}

class Dog extends Animal {

	Dog() {
		//here super() automatically calls when we inherit child with parent
		//so,super class constrctr also executed
		System.out.println("Dog child constrctr");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		// output:
		// Animal super class constrctr
		// Dog child constrctr
	}
}
