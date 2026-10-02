package com.exceptionhandling;

import java.util.Scanner;

class LessMarksException extends Exception {

    public LessMarksException(String message) {
        super(message);
    }
}

public class StudentCustomException {

    static void checkMarks(int marks) throws LessMarksException {

        if (marks < 40) {
            throw new LessMarksException("Student marks are less than 40");
        }

        System.out.println("Student passed");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter marks:");
            int marks = sc.nextInt();

            checkMarks(marks);

        } catch (LessMarksException e) {

            System.out.println(e.getMessage());

        } finally {

            sc.close();
        }
    }
}