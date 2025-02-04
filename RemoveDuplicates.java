package Arrays;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 1, 3, 4 };
        int arr1[] = { 1, 1, 2, 2, 2, 3, 3, 4, 4, 5 };
        int Arr[] = method1forunsortarr(arr);
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i]);
        }
        // System.out.print(method2(arr1));
    }

    public static int[] method1(int arr1[]) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        int nums[] = new int[hs.size()];
        Iterator<Integer> it = hs.iterator();
        int i = 0;
        while (it.hasNext()) {
            nums[i] = it.next();
            i++;
        }
        return nums;
    }
public static int[] method2(int arr1[]){
int i=0;

for(int j=1;j<arr1.length;j++ ){
if(arr1[i]!=arr1[j]){
    i++;
    arr1[i]=arr1[j];
}

}
// // Create a new array with the correct length and copy unique elements
return Arrays.copyOf(arr1,i+1);
}

public static int[] method1forunsortarr(int arr[]){
    HashSet<Integer>hs=new HashSet<>();
    for(int i=0;i<arr.length;i++){
        hs.add(arr[i]);
    }
    Iterator<Integer> it=hs.iterator();
    int num[]=new int[hs.size()];
    int i=0;
    while(it.hasNext()){
        num[i]=it.next();
        i++;
    }
    return num;
}
}
