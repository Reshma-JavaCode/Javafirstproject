package com.languagefundamentals.loops;

import java.util.Random;
import java.util.Scanner;

public class DoWhileRandomNumberGeneration {
//game win or not --random numbers
	public static void main(String[] args) {
		
		Random r=new Random();
		
		Scanner sc=new Scanner(System.in);
		 char choice;
		
		do {
			  int a = r.nextInt(10) + 1;
	            int n;
	            int attempts = 0;
	            boolean won = false;
		
		 do {

             System.out.println("Enter a number (1-10):");
             n = sc.nextInt();

             attempts++;

             if (n > a) {
                 System.out.println("Your number is high");
             }
             else if (n < a) {
                 System.out.println("Your number is low");
             }
             else {
                 System.out.println("Won the game!!!!");
                 won = true;
                 break;
             }

         } while (attempts < 3);
		 
		 if(!won)
		 {
			 System.out.println("You lost the game!!!");
			 System.out.println("The number was: " + a);
		 }
		 System.out.println("Do you want to continue? (y/n)");
         choice = sc.next().charAt(0);

     } while (choice == 'y' || choice == 'Y');

     System.out.println("Game Over!");

     sc.close();
 }
}
