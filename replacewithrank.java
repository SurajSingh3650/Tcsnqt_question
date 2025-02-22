package Arrays;

import java.util.*;

import Arrays.harshad;

public class replacewithrank {
    public static void main(String args[]) {
        int arr[] = { 20, 15, 26, 2, 98, 6 };
        int ans[]=rank2(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
       
    }

    public static int[] rank1(int arr[]) {
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }
     

        int sortedArr[] = arr.clone(); // Create a copy to prevent modifying the original
        Arrays.sort(sortedArr);
        int nums[] = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            int key = ans[i];
            int start = 0;
            int end = sortedArr.length - 1;
            while (start <= end) {
                int mid = (end + start) / 2;
                if (sortedArr[mid] == key) {
                    nums[i] = mid+1;
                    break;
                } else if (sortedArr[mid] > key) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return nums;

    }

    public static int[] rank2(int arr[]){
        int nums[]=new int[arr.length];
        int ans[]=Arrays.copyOf(arr,arr.length);
        int sortedArr[]=Arrays.copyOf(arr,arr.length);
        Arrays.sort(sortedArr);
        HashMap<Integer,Integer>rankMap=new HashMap<>();
for(int i=0;i<arr.length;i++){
if(!rankMap.containsKey(sortedArr[i])){
rankMap.put(sortedArr[i],i+1);
}
else{
    rankMap.put(sortedArr[i],rankMap.get(sortedArr[i]));
}
}
for(int i=0;i<arr.length;i++){
    if(rankMap.containsKey(ans[i])){
        nums[i]=rankMap.get(ans[i]);
    }
}
return nums;
    }
}
