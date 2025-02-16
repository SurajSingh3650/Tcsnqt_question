package Numbers;
import java.util.*;
public class nextpalindrome {
    public static void main(String args[]){
        int n=1005;
        System.out.print(nextnumber(n));
    }
    public static int nextnumber(int n){
        int num=n;
        while(!ispalidrome(num)){
num++;
        }
        return num;
    }

    public static boolean ispalidrome(int num){
        int orignalnumber=num;
           int reverse=0;
           while(num>0){
            int digit =num%10;
            reverse=reverse*10+digit;
            num=num/10;
           }
           if(orignalnumber==reverse){
            return true;
           }
           return false;
    }
}
