package com.arrays;

//Bubble Sort
//Repeatedly compare adjacent elements and swap if they are in the wrong order.
//comparing with all its adjusent elements from array 
//and swap them if they r in wrong order
//sorting happens from end like:
//big ele kept in last position
//4,3,2,1 ---4 is big so,it comes first to its position i.e last 3,2,1,4 etc
public class BubbleSort {

	static void bubbleSort(int[] a)
	{
		//to know iterations take count		
		int count1=0, count2=0;
		
		for(int i=0;i<a.length-1;i++)
		{ 
			boolean status=false;
			count1++;
			//so,here loop gng by skipping last element position
			//since,last element places 1st to its positioni.e 4 at 3rd index
			//now,no need to compare 3rd index etc
			for(int j=0;j<a.length-1-i;j++)
			{count2++;
				if(a[j]>a[j+1])
				{
					int temp= a[j];
					a[j]= a[j+1];
					a[j+1]= temp; 
					status=true;
				}
			}
			
			if(!status)
			{
				break;
			}
		}
		
		System.out.println(count1);
		System.out.println(count2);
	}
	public static void main(String[] args) {
		
		//iteration count i loop= 1time,j loop=3times
		//because of break;TC= O(n); otherwise TC= O(n-square)
		//int a[]= {1,2,3,4}; 
		int a[]= {4,3,1,2};
		
		System.out.println("Before Sorting...");
		for(int i:a)
		{
			System.out.print(i+" ");		
		}
		
		System.out.println("\nafter Bubble sort...");
		bubbleSort(a);
		for(int i:a)
		{
			System.out.print(i+" ");		
		}
		
		//o/p: 1 2 3 4
	}

}
