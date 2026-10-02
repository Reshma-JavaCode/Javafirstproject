package com.multithreading;

import java.util.Scanner;

public class TestDemo4 extends Thread {

	public static void main(String[] args) {

		System.out.println("Main method started");
		Thread t=new TestDemo4();
		t.start();
		System.out.println("Main method ended");
		
	}

	@Override
	public void run()
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
		}
		sc.close();
	}
}
