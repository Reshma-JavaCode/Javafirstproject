package com.arrays;

//product of remaining elements in array
//1,2,3,4
//1--> 2*3*4 =24
//2--> 1*3*4= 12
//3--> 1*2*4= 8
//4--> 1*2*3= 6

//TimeComplexity: O(n*n)

public class ProductOfArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4};
		
		for(int i=0;i<a.length;i++)
		{
			int product=1;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==a[i])
					continue;
				product=product*a[j];
			}
			System.out.println("product of "+a[i]+" ="+product);
		}
	}

}
