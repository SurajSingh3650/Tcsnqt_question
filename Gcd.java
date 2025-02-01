
// this is the program for the GCD (greatest coomon factor) of the two numbers
//for example=


package Arrays;
import java.util.*;
public class Gcd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        Scanner Sc=new Scanner(System.in);
        int b=Sc.nextInt();
        int num=Math.min(a, b);
        for(int i=num;i>0;i--){
if(a%num==0&&b%num==0){
    System.out.print(num);
   break;
}

        }

    }
}
