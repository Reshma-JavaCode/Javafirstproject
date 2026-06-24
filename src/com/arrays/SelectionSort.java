package com.arrays;

public class SelectionSort {
//Selection sort
// Repeatedly select the smallest element from the unsorted portion and place it at the correct position.
	//finds smallest ele fron unsorted part of array
	//and place it as its correct position
	//smallest ele places 1st to its position i.e,
	//4,3,1,2 -> 1 comes 1st to 0th position 1,3,4,2 etc
	static void selectionSort(int[] a)
	{
		
		for(int i=0;i<a.length-1;i++)
		{
			int minIndex=i;
			//so, here gng loop till end of array sz
			//since,1 at 0th index 
			//placed at its actual position acc. to sorting
			//so,no need to compare that 0th position everytime
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]< a[minIndex])
				{
					minIndex = j;
				}
			}
			
			//swapping positions values
			int temp= a[i];
			a[i]= a[minIndex];
			a[minIndex]= temp;
		}
	}
	public static void main(String[] args) {

		int a[] = { 4, 3, 1, 2 };

		System.out.println("Before Sorting...");
		for (int i : a) {
			System.out.print(i + " ");
		}

		System.out.println("\nafter selection sort...");
		selectionSort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
