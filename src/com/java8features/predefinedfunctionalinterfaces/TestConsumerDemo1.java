package com.java8features.predefinedfunctionalinterfaces;

import java.util.function.Consumer;

public class TestConsumerDemo1 {

	public static void main(String[] args) {

		Consumer<Integer> c1=(a)->{System.out.println(a*100);};
		c1.accept(10);//1000
		
		Consumer<String> c2=(s)->{System.out.println("Welcome "+s);};
		c2.accept("Reshma"); // Welcome Reshma
		
		
			
			
		}
		
	}


