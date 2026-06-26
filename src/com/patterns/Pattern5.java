package com.patterns;

public class Pattern5 {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		int p=1;
		for(int i=0;i<=n;i++)
		{
			p=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(p+" ");
				p= p*(i-j)/(j+1);
			}
			
			System.out.println();
		}
	}

}
