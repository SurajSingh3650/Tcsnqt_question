// Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

// Examples:

// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5} K=2
// Output: {3,4,5,1,2}
// Explanation: Rotate the array to right by 2 elements.

// Example 2:
// Input: N = 7, array[] = {1,2,3,4,5,6,7} K=3
// Output: {4,5,6,7,1,2,3}
// Explanation: Rotate the array to right by 3 elements. 

package Arrays;

import java.util.*;

public class Rotate {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;
        leftrotate(arr, k);

        System.out.println(Arrays.toString(arr));

        rightrotate(arr, k);

        System.out.print(Arrays.toString(arr));
    }

    public static void leftrotate(int[] arr, int k) {
        int n = arr.length;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

        // return arr;

    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rightrotate(int arr[], int k) {
        int n = arr.length;
      
        reverse(arr, n - k, n - 1);  // Step 1: Reverse the last k elements
        reverse(arr, 0, n - k - 1);  // Step 2: Reverse the first n-k elements
        reverse(arr, 0, n - 1);      // Step 3: Reverse the whole array
    }

}
