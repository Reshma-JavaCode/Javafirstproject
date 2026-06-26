package com.arrays;

public class PairsArray {

	public static void main(String[] args) {

		int a[]= {2,4,3,5,7,8,9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]+a[j])==12)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
		
		/*boolean isVisited=false;	
		for(int k=i+1;k<a.length;k++)
			{
				if(a[i]==a[k])
				{
					isVisited=true;
				}
			}
			
			if(isVisited)
			{
				continue;
			}*/
		
	}

}
