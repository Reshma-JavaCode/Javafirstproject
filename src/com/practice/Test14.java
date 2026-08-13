package com.practice;

public class Test14 {

	public static void main(String[] args) {
		
		int a[]= {8,4,2,6};
		int res[]=new int[a.length-1];
		int index=0;
		int sum=0,max=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]<a[i])
			{
				res[index]=a[i]-a[i+1];
				index++;
				sum+=a[i]-a[i+1];
				if(a[i]-a[i+1]>max)
					max=a[i]-a[i+1];
			}
			else
			{
				res[i]=0;
			}
		}
	int s=0;
		for(int m:res)
		{
			s+=m;
			System.out.print(m+" ");
		}
		System.out.println();
		System.out.println(sum);
		System.out.println(max);
		System.out.println(s);
	}

}
