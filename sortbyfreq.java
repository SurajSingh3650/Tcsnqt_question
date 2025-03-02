package Arrays;
import java.util.*;
public class sortbyfreq {
    public static void main(String args[]){
        int arr[]={1,2,3,2,4,3,1,2};
    }
    public static int[] sort(int arr[]){
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        int num[]=new int[arr.length];
        int index=0;
        int largest=Integer.MIN_VALUE;

      for(  Map.Entry<Integer,Integer>suraj : hm.entrySet()){
if(suraj.getValue()>=largest ){
    
}

      }
    }
}
