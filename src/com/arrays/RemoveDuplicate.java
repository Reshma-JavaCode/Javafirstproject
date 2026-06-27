package com.arrays;

	import java.util.Arrays;

	public class RemoveDuplicate {

	    public static void main(String[] args) {

	        int[] a = {10, 20, 20, 10, 30, 40, 30};

	        int[] result = new int[a.length];

	        int index = 0;

	        for (int i = 0; i < a.length; i++) {

	            boolean duplicate = false;

	            // Check whether a[i] is already in result[]
	            for (int j = 0; j < index; j++) {

	                if (a[i] == result[j]) {
	                    duplicate = true;
	                    break;
	                }
	            }

	            if (!duplicate) {
	                result[index] = a[i];
	                index++;
	            }
	        }

	        System.out.println(Arrays.toString(result));
	    }
	}
