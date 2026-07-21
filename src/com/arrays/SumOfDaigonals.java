package com.arrays;

public class SumOfDaigonals {
////Sum of primary and secondary diagonals of a matrix
	
	//Primary diagonal → arr[i][i]
    //Secondary diagonal → arr[i][n - 1 - i]
	//Odd n? → Subtract arr[n / 2][n / 2]
		//once to avoid double-counting the center element.
	
	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int primarySum = 0;
		int secondarySum = 0;
		int n = a.length; // 3

		for (int i = 0; i < n; i++) {
			primarySum += a[i][i];// 00 11 22
			secondarySum += a[i][n - 1 - i];// 02 11 20
		}

		System.out.println("sum of primary diagonal= " + primarySum);//15
		System.out.println("sum of secondary diagonal= " + secondarySum);//15
		
		int total= primarySum + secondarySum;
		//1+5+9=15
		//3+5+7=15
		//15+15=30-5=25
		//at(1,1)=5 repeated so subtract one 5
		
		//odd-sized matrix (3×3, 5×5, 7×7, ...):
		  //There is one common center element, so subtract it once.
		//even-sized matrix (2×2, 4×4, 6×6, ...):
		   //There is no single center element, so don't subtract anything.
		
		if(n%2==1) // Odd-sized matrix
		{
			total-= a[n/2][n/2];//5 is common so,subtract one 5
		}
		
		System.out.println("Sum of primary and secondary diagonal= "+total);//25
	}

}
