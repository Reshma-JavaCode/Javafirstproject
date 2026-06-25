package com.arrays;


////Q)WAP to find commomn elements between 2 arrays
//ex:
//int a[]= {10,20,10,40,50};
//int b[]= {30,40,50,70,10};

//output:10,40,50
public class TwoArraysComparision {

	public static void main(String[] args) {
		
		int a[]= {10,20,10,40,50};
		int b[]= {30,40,50,70,10};
		
		//System.out.println("Common elements are:");
        
		for(int i=0;i<a.length;i++) {
			
            boolean alreadyPrinted = false;

         // Check if a[i] appeared earlier in a[]
            for(int k = 0; k < i; k++) {
                if(a[i]==a[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if(alreadyPrinted)
                continue;

             // Check if a[i] exists in b[]
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(b[j]);
					break;
				}
			}
		}
	}

}
