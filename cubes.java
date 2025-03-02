package Arrays;
import java.util.*;
public class cubes {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.print(rangecube(n, m));

        }
        public static int rangecube(int n,int m){
            int sum=0;
            for(int i=n;i<=m;i++){
sum+=Math.pow(i,3);
            }
            return sum;
        }
}
