package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class SlidindWind2 {

	public static void main(String[] args) {
				
				int users[]= {5,7,1,4};
				int res[]=new int[users.length],index=0;
				int windowSum=0, avg=0;
				System.out.println("Enter how many days data do you want??:");
				Scanner sc=new Scanner(System.in);
				int days= sc.nextInt();//3
				
				for(int i=1;i<=days;i++)
				{
					windowSum += users[i];//8
				}
				
				for(int i=0;i<users.length;i++)
				{
					res[i]=windowSum;//8 
					//[8, 5, 9, 12]
					windowSum= windowSum- users[(i+1)%users.length]+ users[(i+days+1)%users.length];
					//8-7+4=5
					

				}
				
				System.out.println(Arrays.toString(res));
				
				sc.close();
			}

		}


	
