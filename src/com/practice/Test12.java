package com.practice;

public class Test12 {

	static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {

		int n=3,num=1;
		
		for(int i=1;i<=n;i++)
		{
			int temp[]=new int[i];
			
			for(int j=0;j<i;)
			{
				if(num==1 || !isPrime(num))
				{
					temp[j]=num;
					j++;
				}
				num++;
			}
			if(i%2!=0)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print(temp[j]);
				}
			}
			else {

                // Reverse
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(temp[j] + " ");
                }
			}
			System.out.println();
		}
		
	}

}
