package com.languagefundamentals.loops;

import java.util.Scanner;

public class FibanocciSeries {

	static void fibSeries(int n)
	{
		       // int n = 10;
		        int n1 = 0, n2 = 1;

		        System.out.print(n1 + " " + n2 + " ");

		        for (int i = 1; i <= n-2; i++) {
		            int n3 = n1 + n2;
		            System.out.print(n3 + " ");

		            n1 = n2;
		            n2 = n3;
		        }
		    
	}
	public static void main(String[] args) {

		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("hw many numbers do u want to print ?");
		n= sc.nextInt();//10
		fibSeries(n);
	}

}
