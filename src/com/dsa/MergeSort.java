package com.dsa;

import java.util.Arrays;

public class MergeSort {

//	//Divide or split the array
//	public static void divide(int[] a,int s,int e)
//	{
//		if(s<e)
//		{
//			int mid=(s+e)/2;
//			divide(a,s,mid);
//			divide(a,mid+1,e);
//			conquer(a,s,mid,e);
//		}
//	}
//	
//	
//	//Merging 	
//	public static void conquer(int[] a,int s,int m,int e)
//	{
//		int indx1= s, indx2=m+1;
//		int sz= e-s+1;
//		
//		int merge[]=new int[sz],x=0;
//		
//		while(indx1<=m && indx2<=e)
//		{
//			if(a[indx1]<=a[indx2])
//			{
//				merge[x++]= a[indx1++];
//			}
//			else
//			{
//				merge[x++]=a[indx2++];
//			}
//		}
//			while(indx1<=m)
//			{
//				merge[x++]= a[indx1++];
//			}
//			while(indx2<=m)
//			{
//				merge[x++]=a[indx2++];
//			}
//			
//			for(int i=0,j=s;i<merge.length;i++,j++)
//			{
//				a[j]=merge[i];
//			}
//		
//	}
	
	public static void conquer(int[] a,int s,int m,int e)
	{
		int merge[]=new int[e-s+1];
		
		int indx1=s,indx2=m+1,x=0;
		
		while(indx1<=m && indx2<=e)
		{
			if(a[indx1]<=a[indx2])
			{	
				merge[x++]=a[indx1++];
			}
			else
			{
				merge[x++]=a[indx2++];
			}
		}
		while(indx1<=m)
		{
			merge[x++]=a[indx1++];
		}
		while(indx2<=e)
		{
			merge[x++]=a[indx2++];
		}
		
		for(int i=0,j=s;i<merge.length;i++,j++)
		{
			a[j]=merge[i];
		}
	}
	
	public static void divide(int[] a,int s,int e)
	{
		if(s<e)
		{
			int mid=(s+e)/2;
			divide(a,s,mid);
			divide(a,mid+1,e);
			conquer(a,s,mid,e);
		}
	}
	
	public static void main(String[] args) {

		int a[]= {5,3,4,2};
		
		divide(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

}
