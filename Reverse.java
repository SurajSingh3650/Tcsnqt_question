package Arrays;
// Reverse a given Array

// Problem Statement: You are given an array. The task is to reverse the array and print it. 

// Examples:

// Example 1:
// Input: N = 5, arr[] = {5,4,3,2,1}
// Output: {1,2,3,4,5}
// Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

// Example 2:
// Input: N=6 arr[] = {10,20,30,40}
// Output: {40,30,20,10}
// Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
public class Reverse {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
      int  n=arr.length;
        //  for(in t  i=arr.len g th - 1; i> =0;i --){
        //     System.out.print(arr [ i]+" ");
        // }
        reverseArray(arr, n);


    }
    static void reverseArray(int arr[], int n) {
        int[] ans = new int[n];
           for  (int i = n - 1; i >= 0; i--) {
           ans[n - i - 1] = arr[i];
        }
      }

    
        public void printArray(int ans[], int n) {
        System.out.print("Reversed ar");
             for(int i = 0; i < n; i++) {
         System.out.print(ans[i]);
       }
         }
}
