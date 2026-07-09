package com.arrays;

public class TwoArraysMerging {

	public static void sort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]= temp;
				}
			}
		}
	}
	public static void main(String[] args) {

		int a[]={1, 3, 5, 7};
		int b[]={2, 4, 6, 8};
		
		int n=a.length;
		int m=b.length;
		
		int sum=n+m;
		
		int[] res= new int[sum];
		
		
		for(int i=0;i<a.length;i++)//0-3
		{
			res[i]= a[i];
		}
		int index=a.length;
		for(int i=0;i<b.length;i++)//4-7
		{
			res[index]= b[i];
			index++;
		}
		
		for(int i=0;i<sum;i++)
		{			
			System.out.print(res[i]+" ");
		}	
		
		System.out.println();
		sort(res);
		for(int i=0;i<sum;i++)
		{
			System.out.print(res[i]+" ");
		}
		
	}

}
