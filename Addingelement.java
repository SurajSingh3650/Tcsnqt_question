package Arrays;

import java.util.*;

public class Addingelement {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int value = 10;
       int position=5;
        int Arr[] = insertspecificposition(arr, value,position);
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }

    }

    public static int[] insertbeginning(int arr[], int value) {
        int nums[] = new int[arr.length + 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = arr[i - 1];
        }
        nums[0] = value;

        return nums;
    }

    public static int[] insertending(int arr[], int value) {
        int nums[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        nums[nums.length - 1] = value;
        return nums;
    }

    public static int[] insertspecificposition(int arr[], int value, int position) {
        int nums[] = new int[arr.length + 1];
      for(int i=0;i<position-1;i++){
        nums[i]=arr[i];
      }
      nums[position-1]=value;
      for(int j=position-1;j<arr.length;j++){
        nums[j+1]=arr[j];
      }
        return nums;    
    }
}
