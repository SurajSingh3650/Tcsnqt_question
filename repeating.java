package Arrays;
import java.util.*;
public class repeating {
    public static void main(String args[]) {
        int arr[] = { 1, 1, 2, 3, 4, 4, 5, 2 };
        // int nums[] = method1(arr);
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != 0) { // Avoid printing extra zeros
        //         System.out.print(nums[i] + " ");
        //     }
        // }

//         ArrayList<Integer>list=new ArrayList<>(method2(arr));
//         for(int i=0;i<list.size();i++){
// System.out.print(list.get(i));
//         }
int nums[] = method3(arr);
for (int i = 0; i < nums.length; i++) {
   
    if (nums[i] != 0) { // Avoid printing extra zeros
           System.out.print(nums[i] + " ");
          }
}


    }

    public static int[] method1(int arr[]) {
        int num[] = new int[arr.length];
      
        for (int i = 0; i < arr.length; i++) {
            boolean isthere = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]&&i!=j) {
                    isthere = true;
                    break;
                }
            }
            if (isthere == false) {
                num[i] = arr[i];
            }
        }
        return num;

    }

    public static ArrayList  method2(int arr[]){
             Arrays.sort(arr);
ArrayList<Integer>list=new ArrayList<>();
             for(int i=0;i<arr.length-1;i++ ){
if(arr[i]==arr[i+1]){
list.add(arr[i]);
}
             }
             return list;
    }
 

    public static int[] method3(int arr[]){
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        int num[]=new int[hm.size()];
        int i=0;
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            if(entry.getValue()>=2){
                num[i++]=entry.getKey();
            }
        }
       return num; 
    }

}
