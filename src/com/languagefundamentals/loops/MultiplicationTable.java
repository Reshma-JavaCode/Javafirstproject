package com.languagefundamentals.loops;

import java.util.Scanner;
//Print the multiplication table of a given number.
public class MultiplicationTable {
void multiply(int n1,int n2)
{
	for(int i=1;i<=n2;i++)
	{
		System.out.println(n1+" X "+i+" = "+(n1*i));
	}
}
	public static void main(String[] args) {

		int n1,n2,mul=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to do multiplication: ");
		n1= sc.nextInt();
		System.out.println("up to where do you want to do multiplication: ");
		n2= sc.nextInt();
		MultiplicationTable obj= new MultiplicationTable();
		obj.multiply(n1,n2);
		
		
	}

}
