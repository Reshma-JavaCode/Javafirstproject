package com.streamapi.programming;

//Write a lambda expression to check given perfect number or not
//6, Sum = 1 + 2 + 3 = 6.
interface PerfectNum{
	boolean perfectNum(int a);
}
public class Lamda03 {

	public static void main(String[] args) {

		PerfectNum p=(a)->{
			int sum=0;
			for(int i=1;i<a;i++)
			{
				if(a%i==0)
				{
					sum=sum+i;
				}
			}
			return sum==a;
			/*if(sum==a)
				return true;
			else
				return false;*/
		};
		
		System.out.println(p.perfectNum(6));
		System.out.println(p.perfectNum(10));
		}

}
