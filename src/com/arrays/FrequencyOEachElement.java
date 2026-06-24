package com.arrays;

public class FrequencyOEachElement {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 2, 3, 2, 1 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			boolean visited = false;

			// Skip if already counted
			for (int v = 0; v < i; v++)
			// let i=3rd-index, val=2;
			// i=3 compares v=0,1,2
			{
				if (a[i] == a[v])// a[3]==a[1]-true
				{
					visited = true;
					break;
				}
			}
			if (visited) { // true
				continue; //goes to i's for loop
				// skip a[3] count since 2 already counted at 1st index.
			} // now i++ =4 

			// logic to find occurence
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {// 0-> 1,2,3,4,5,6(T)
					count++;//
				}
			}
			System.out.println(a[i] + " = " + (count + 1));
		}
	}

}
