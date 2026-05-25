package com.languagefundamentals.constructor;

public class Order {

	
	    int orderId;
	    String productName;
	    double price;

	    // Constructor 1
	    Order() {
	        this(101);
	        System.out.println("Default order created");
	    }

	    // Constructor 2
	    Order(int orderId) {
	        this(orderId, "Laptop");
	        System.out.println("Order ID initialized");
	    }

	    // Constructor 3
	    Order(int orderId, String productName) {
	        this(orderId, productName, 50000);
	        System.out.println("Product initialized");
	    }

	    // Constructor 4
	    Order(int orderId, String productName, double price) {

	        this.orderId = orderId;
	        this.productName = productName;
	        this.price = price;

	        System.out.println("Price initialized");
	    }

	    void display() {
	        System.out.println(orderId + " " +
	                           productName + " " +
	                           price);
	    }
	    //main method
	    public static void main(String args[]) {

	        Order o = new Order();

	        o.display();
	    }
	}


