package com.languagefundamentals.constructor;

public class Parent {
	    Parent() {
	        System.out.println("Parent constructor");
	    }
	}

	class Child extends Parent {

	    Child() {
	        super(); // calls parent constructor
	        System.out.println("Child constructor");
	    }
	    
	    public static void main(String args[]) {
	        Child c = new Child();
	    }	}

