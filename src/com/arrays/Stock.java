package com.arrays;

public class Stock {

	public static void main(String[] args) {

		int a[]= {7,1,5,6,4};
		
		int max=0,profit=0;
		
		int res[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			
			max=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]-a[i]>0)
				{
					
					profit= a[j]- a[i];
								
					if(profit> max)
					{
						max= profit;
					}
					
				}
			}
			res[i]= max;
			System.out.println("Max profit of "+a[i]+" is"+max);
		}
		
		int t=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(res[i]<res[i+1])
			{
				t= res[i+1];
			}
		}
		
		System.out.println(t);
	}

}
