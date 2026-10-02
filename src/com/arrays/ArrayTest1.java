package com.arrays;

import java.util.Arrays;

/*
 * Find an element that is greater than all elements on
 * its left and smaller than all elements on its right.
 */
public class ArrayTest1 {

	public static void main(String[] args) {

		//int[] a = {5, 1, 4, 3, 10, 8, 10, 7};
		
	/*	for(int i=1;i<a.length;i++)
		{
			boolean greaterLeft = true;
            boolean smallerRight = true;

            // Check left side
			//left side
			for(int j=0;j<i;j++)
			{
				if(a[i]<=a[j])
				{
					greaterLeft=false;
					break;
				}
			}
			
			// Check right side
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] >= a[j]) {
                    smallerRight = false;
                    break;
                }
            }
            if (greaterLeft && smallerRight) {
                System.out.println(a[i]);
                break;
            }
        }
		*/
		// {5, 1, 4, 3, 6, 8, 10, 7}
		/*int max1,max2;
		max1=max2=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
			else if((a[i]>max2) )
			{
				max2=a[i];
			}
		}
		System.out.println(max2);
		
		
		//{5, 1, 4, 3, 6, 8, 10, 7}
		int min1,min2;
		min1=min2=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min1)
			{
				min2=min1;
				min1=a[i];
			}
			else if((a[i]<min2))
			{
				min2=a[i];
			}
		}
		System.out.println(min2);
		
		System.out.println("** even or odd count **");
		int evenCount=0,oddCount=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				evenCount++;
			else
				oddCount++;
				
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
		
		
		System.out.println("** Positive,negative and zero **");
		int positiveCount=0,negativeCount=0,zeroCount=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
				positiveCount++;
			else if(a[i]<0)
				negativeCount++;
			else
				zeroCount++;
				
		}
		System.out.println(positiveCount);
		System.out.println(negativeCount);
		System.out.println(zeroCount);
		
		System.out.println("\nsum of all even index elemenets");
		int sum=0;
		for(int i=0;i<a.length;i=i+2)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		System.out.println("\nsum of all odd index elemenets");
		int sum2=0;
		for(int i=1;i<a.length;i=i+2)
		{
			sum2=sum2+a[i];
		}
		System.out.println(sum2);*/
		
	/*	//System.out.println("\n");
		int target=10;
		boolean found=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				System.out.println("Element found at index: "+i);
				found=true;	
				break;
			}
			
		}
		if(found)
			System.out.println("ele found");
		else
		
			System.out.println("ele not found");
			*/
		
		/*int target=10;
		boolean found=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				System.out.println("Element found at index: "+i);
				found=true;	
				break;
			}
			
		}
		if(!found)
			System.out.println("ele not found");*/
		
	/*	System.out.println("\n");
		int target=10;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				
				count++;
			}
			
		}
		if(count>0)
			System.out.println("ele occurence: "+count);
		else
			System.out.println("ele not found");
	*/
		
	//	[5, 1, 4, 3, 10, 8, 10, 7]
		//two pointers 
		
 System.out.println("given array is Polindrome or not");
	int[]	a = {  1 ,2, 3 ,2 ,1};
		int start=0,end=a.length-1;
		boolean status=true;
		
		
		System.out.println(Arrays.toString(a));
		
			while(start<end)
			{
				 if (a[start] != a[end])
				    {
				        status = false;
				        break;
				    }

				    start++;
				    end--;
				
			}
		if(status)
			System.out.println("Polindrome");
		else
			System.out.println("Not");
		//System.out.println(Arrays.toString(a));
//		int count=0;
//		for(int i=0;i<a.length;i++)
//		{
//		if(rev[i]==a[i])
//		{
//			count++;
//		}
//		}
//		if(count==a.length)
//			System.out.println("Polindrome");
//		else
//			System.out.println("not a Polindrome");
		
	}

}
