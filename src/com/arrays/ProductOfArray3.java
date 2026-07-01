package com.arrays;

//product of remaining elements in array
//1,2,3,4
//1--> 2*3*4 =24
//2--> 1*3*4= 12
//3--> 1*2*4= 8
//4--> 1*2*3= 6

//Time complexity: O(n);

public class ProductOfArray3 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};		
		int n= a.length;

		int prefix[]= new int[n];
		int sufix[]= new int[n];
		
		prefix[0]=1;
		sufix[n-1]=1;
		
		for(int i=1;i<n;i++)
		{
			prefix[i]= prefix[i-1] * a[i-1];
		}
		
		
		for(int j=n-2; j>=0; j--)
		{
			sufix[j]= sufix[j+1] * a[j+1];
		}
		
		for(int i=0;i<n;i++)
		{
		System.out.println("Product expected at "+a[i]+"= "+(prefix[i]*sufix[i]));		
		}
		
	}

}
