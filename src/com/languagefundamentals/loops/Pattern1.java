package com.languagefundamentals.loops;

public class Pattern1 {

	public static void main(String[] args) {
	/*	for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=5;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}


		        int n = 5;

		        for(int i = 1; i <= n; i++) {
		        	
		        	for(int k=n;k>i;k--)
		        	{
		        		System.out.print(" "); 
		        	}
                  for(int j = 1; j <= i; j++) {

		                System.out.print(" *"); 

		            }
		            System.out.println();

		        }
		        System.out.println();
		        
		        for(int i = 1; i <= n; i++) {
		        	
		        	for(int k=1;k<i;k++)
		        	{
		        		System.out.print(" "); 
		        	}
                  for(int j = n; j >= i; j--) {

		                System.out.print(" *"); 

		            }
		            System.out.println();

		        }

		        System.out.println();
		        for(int i = 1; i <= n; i++) {
		        	
		        	for(int k=1;k<=n-i;k++)
		        	{
		        		System.out.print(" "); 
		        	}
                  for(int j = 1; j <= 2*i-1; j++) {

		                System.out.print("*"); 

		            }
		            System.out.println();

		        }
		        
		        System.out.println();
		        for(int i = n; i >= 1; i--) {
		        	
		        	for(int k=1;k<=n-i;k++)
		        	{
		        		System.out.print(" "); 
		        	}
                  for(int j = 1; j <= 2*i-1; j++) {

		                System.out.print("*"); 

		            }
		            System.out.println();

		        }
		        
		        */
		int n=5;
		        System.out.println();
		        for(int i=1;i<=n;i++)
		        {
		        	for(int j=1;j<=n;j++)
		        	{
		        		if(i==1||i==n||j==1||j==n)
		        		{
		        			System.out.print("*");
		        		}
		        		else
		        			System.out.print(" ");
		        	}System.out.println();
		        }
		    }

		

}
