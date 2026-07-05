package com.dsa;

//Binary search
//Time complexity: O(log n)
//applied only for sorted arrays

//If array unsorted then need to sort 1st the apply BS
//TC: Sorting + Binary Search → O(n log n) + O(log n)
public class BinarySearch {

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,60,70};

        int key = 30;

        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                return;
            }
            else if(arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}


