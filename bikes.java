package Arrays;
import java.util.*;
public class bikes {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
}
System.out.print(pairbikes(arr));
    }
    public static int pairbikes(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
if(arr[i]==0){


            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==1){
                    count++;
                }
            }
        }}
        return count;
    }
}
