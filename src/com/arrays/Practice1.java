package com.arrays;

public class Practice1 {

	public static void main(String[] args) {

		int p[] = {7, 1, 5, 3, 6, 4};

		int maxprofit=0;//int profit=0;
		int min=p[0];
		
		for(int i=1;i<p.length;i++)
		{
			
			if(min>p[i])
			{
				min= p[i];
			}
			
			else {
				
				int profit= p[i]-min;
				
				if(profit >maxprofit)
				{
					maxprofit= profit;
				}
			}
			
		}
		
		System.out.println(maxprofit);
	}

}
