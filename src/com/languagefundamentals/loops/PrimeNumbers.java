package com.languagefundamentals.loops;

public class PrimeNumbers {
//WAP to Print all prime numbers from 1 to 100.
	public static void main(String[] args) {

		int n,count;
		
		
		for(n=1;n<=100;n++)
		{
			count=0; //for each inner for loop count=0 only
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
					
				}
			}
			
			System.out.println();
			if(count==2)
			{
				
				System.out.print(n+" ");
			}
		}
	}

}
