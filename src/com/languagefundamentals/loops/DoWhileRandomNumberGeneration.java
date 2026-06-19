package com.languagefundamentals.loops;

public class DoWhileRandomNumberGeneration {
//game win or not --random numbers
	public static void main(String[] args) {
		int n=10;
		do {
			System.out.println("enter a ");
			if(n==10)
			System.out.println("Game win..");
			else
				System.out.println("Lose the Game...");
		}while(n!=10);
	}

}
