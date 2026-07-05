package com.dsa;

//Linear search
//Time complexity: 
//O(1) if ele found at 1st index
//else O(n)
public class LinearSearch {

    public static void main(String[] args) {

        int arr[] = {10, 15, 25, 30, 40};
        int key = 25;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Element not found");
    }
}
