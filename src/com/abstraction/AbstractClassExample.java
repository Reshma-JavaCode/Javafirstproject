package com.abstraction;


abstract class Animal2 {

	static
	{
		System.out.println("Static block");
	}
	{
		System.out.println("Instance block");
	}
    // Instance variable
    String name;

    // Constructor
    Animal2(String name) {
        this.name = name;
    }

    // Concrete method
    void eat() {
        System.out.println(name + " is eating.");
    }

    // Abstract method
    abstract void sound();
    
    public static void main(String []args)
    {
    	System.out.println("main method from abstract class");
    	//we can't create object for abstract class in its main() also
    	//Animal2 a=new Animal2();//CE: Cannot instantiate the type Animal2
    }
}

class Dog2 extends Animal2 {

    Dog2(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Bark");
    }
}

class Cat2 extends Animal2 {

    Cat2(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Meow");
    }
}


public class AbstractClassExample {

	public static void main(String[] args) {


		        Animal2 a1 = new Dog2("Tommy");
		        Animal2 a2 = new Cat2("Kitty");

		        a1.eat();
		        a1.sound();

		        System.out.println();

		        a2.eat();
		        a2.sound();
		        
		       /*result: Static block
		        Instance block
		        Instance block
		        Tommy is eating.
		        Tommy says: Bark

		        Kitty is eating.
		        Kitty says: Meow*/
		    }
		
	}


