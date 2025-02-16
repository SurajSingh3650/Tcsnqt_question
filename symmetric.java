package Arrays;

import java.util.*;

public class symmetric {
    public static void main(String args[]) {
        int arr[] = { 1, 2, -3, 0, -4, -5 };
        System.out.println(better(arr));

    }
         
    public static int brute(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) { 
                    prod *= arr[k];
                }
                max = Math.max(prod, max);
            }
        }
        return max;
    }

    public static int better(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int product = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                max = Math.max(product, max);
                product *= arr[j];
                
            }
            max = Math.max(product, max);
        }
        return max;
    }
}
