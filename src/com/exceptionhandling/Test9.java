package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        // 1. Find length of a String -> NullPointerException
        try {
            String name = null;

            System.out.println("Student Name Length: " + name.length());
        }
        catch (NullPointerException e) {
        	System.out.println(e.toString());
            System.out.println("Error: Student name cannot be null.");
        }


        // 2. Take age input -> InputMismatchException
        System.out.println();
        try {
            System.out.print("Enter student age: ");
            int age = sc.nextInt();

            System.out.println("Student Age: " + age);
        }
        
        catch (InputMismatchException e) {
        	System.out.println(e.toString());
            System.out.println("Error: Please enter age as a number.");
            //sc.nextLine(); // clears invalid input
        }


        // 3. Calculate average marks -> ArithmeticException
        System.out.println();
        try {
            int totalMarks = 450;
            int subjects = 0;

            int average = totalMarks / subjects;

            System.out.println("Average Marks: " + average);
        }
        catch (ArithmeticException e) {
        	System.out.println(e.toString());
            System.out.println("Error: Cannot calculate average because subjects are zero.");
        }


        // 4. Access array element -> ArrayIndexOutOfBoundsException
        System.out.println();
        try {
            int[] marks = {80, 75, 90, 85, 95};

            System.out.println("Student Mark: " + marks[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        	System.out.println(e.toString());
            System.out.println("Error: Invalid array index.");
        }


        // finally block
        finally {
            System.out.println("Online Student Portal operation completed.");
            sc.close();
        }
    }
}