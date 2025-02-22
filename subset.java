package Arrays;

import java.util.*;

public class subset {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        int arr1[] =  {1,3,4,5,2};
        int arr2[] = {2,4,3,1,7,5,15};
        // for (int i = 0; i < n; i++) {
        //     arr1[i] = sc.nextInt();
        // }
        // for (int i = 0; i < m; i++) {
        //     arr2[i] = sc.nextInt();
        // }
        System.out.print(issubset3(arr1, arr2));
    }

    public static boolean issubset(int arr1[], int arr2[]) {
        // Array elements are assumed to be unique.

        for (int i = 0; i < arr1.length; i++) {
            boolean present = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    present = true;
                    break;
                }
            }
            if (present == false) {
                return false;
            }

        }
        return true;
    }

    public static boolean issubset2(int arr1[], int arr2[]) {
        // Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for (int k = 0; k < arr1.length; k++) {
            int i = 0;
        int j = arr2.length-1;
            int key = arr1[k];
            boolean present = false;
            while (i <= j) {
                int mid = (i + j) / 2;

                if (arr2[mid] == key) {
                    present = true;
                    break;
                } else if (arr2[mid] > key) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
            if(present==false){
                return false;
            }
        }
        return true;

    }
    public static boolean issubset3(int arr1[],int arr2[]){
        HashMap<Integer,Boolean>hm=new HashMap<>();
for(int i=0;i<arr2.length;i++){
    hm.put(arr2[i], true);
}
for(int i=0;i<arr1.length;i++){
    if(hm.get(arr1[1])==false){
        return false;
    }
}
return true;
    }
}
