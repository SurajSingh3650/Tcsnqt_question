package Numbers;
import java.util.*;
public class harshad {
    public static void main(String args[]){
        int n=18;
        System.out.print(harshadnumber(n));
    }
    public static boolean harshadnumber(int n){
        int orginalnumber=n;
        int sum=0;
        while(n>0){
int digit= n%10;
sum+=digit;
n=n/10;

        }
        if(orginalnumber%sum==0){
            return true;
        }
        return false;
    }
}
