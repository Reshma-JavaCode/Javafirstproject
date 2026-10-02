package com.arrays;

public class SubArray1 {

	public static void main(String[] args) {

		//int a[]= {1,2,3};
		int a[]= {2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		int sum=0;int index=0;
		int n=a.length;
		int res[]=new int[(n*(n+1)/2)];
			int k=0;
		while(k<a.length)
		{
			for(int i=k;i<a.length;i++)
			{
				sum=0;
				for(int j=k;j<=i;j++)//0 1 3
				{
					System.out.print(a[j]+" ");//1 2 3
					sum=sum+a[j];
				}
				res[index++]=sum;
				System.out.println();
				//System.out.println("sum= "+sum);
			}
			k++;
		}
		
		System.out.println("\nMaximum sum:");
		int max=res[0];
		for(int i=1;i<res.length;i++)
		{
			//System.out.print(res[i]+" ");
			if(max<res[i])
			{
				max=res[i];
			}
		}
		
		System.out.println(max);
	}

}
