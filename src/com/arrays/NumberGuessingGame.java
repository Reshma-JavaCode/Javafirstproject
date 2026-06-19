package com.arrays;

import java.util.Scanner;

//***********Console-base Game************
//Guessing Number in 3 attempts
public class NumberGuessingGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, countAttempts;
		//n = 2;
		String yn = " ";
		int randomNumber;
	
		System.out.println("********WELCOME TO NUMBER GUESSING GAME*********");
		System.out.println("__________________________________________________");
		System.out.println("You Have 3 Attempts to Win the Game...");
		
		do {
			//to get random number -- random numbers: 0.0 to 0.1
			//every time it gng to give one randome no. btwn 0-9 digits
			randomNumber= (int)(Math.random()*10); // 0.0*10=0 to 0.1*10=1
			//System.out.println(randomNumber);
			countAttempts=0;
			
			for (int i = 1; i <= 3; i++) {
				
				System.out.println("Enter a number in between(0-9):");
				int guessNumber = sc.nextInt(); 
				countAttempts++;

				if (guessNumber == randomNumber) {
					System.out.println("Congratulation You Won the Game 🎉🎉🎉");
					break;
				} 
				else if (guessNumber < randomNumber) {
					System.out.println("Your Number is Low");
				} 
				else {
					System.out.println("Your Number is High");
				}
				
				//System.out.println("count= "+countAttempts);
				if (countAttempts == 3)
					System.out.println("Your Attempts Completed !!!");	
			}
			
			System.out.println("***************************************");
			System.out.println("Do you want to continue the game ?");
			System.out.println("Please Enter for Yes-Y, fo No-N...(Y/N)");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("Y"));

		sc.close();
	}

}

/*Output:
 
*********WELCOME TO NUMBER GUESSING GAME*********
__________________________________________________
You Have 3 Attempts to Win the Game...
Enter a number in between(0-9):
2
Your Number is Low
Enter a number in between(0-9):
1
Your Number is Low
Enter a number in between(0-9):
4
Your Number is Low
Your Attempts Completed !!!
***************************************
Do you want to continue the game ?
Please Enter for Yes-Y, fo No-N...(Y/N)
y
Enter a number in between(0-9):
5
Your Number is Low
Enter a number in between(0-9):
7
Your Number is Low
Enter a number in between(0-9):
8
Congratulation You Won the Game 🎉🎉🎉
***************************************
Do you want to continue the game ?
Please Enter for Yes-Y, fo No-N...(Y/N)
N

*/
