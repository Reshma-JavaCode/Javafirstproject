package com.languagefundamentals.operators;

class Animal {
}

class Dog extends Animal {
}

 class Cat extends Animal
 {
	 
 }

public class Instanceof {

	public static void main(String[] args) {

		Dog d = new Dog();

		System.out.println(d instanceof Dog);
		System.out.println(d instanceof Animal);
		//CE:System.out.println(d instanceof Cat);
		
		Animal a=new Animal();
		System.out.println(a instanceof Dog);//false
		//since parent not refereing from child
		//child refering from parent
	}

}
