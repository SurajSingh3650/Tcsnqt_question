package Arrays;
import java.util.*;
public class equilibrium {
    public static void main(String args[]){
        int nums[]={2,3,-1,8,4};
        System.out.print(equilibriumiindex(nums));
    }
    public static int equilibriumiindex(int nums[]){
        int totalsum=0;
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(leftsum==totalsum-leftsum-nums[i]){
 return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}
