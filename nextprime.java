package Numbers;

import java.util.*;

public class nextprime {
    public static void main(String args[]) {
        int n = 99;
System.out.print(nextprimenumber(n));
    }

    public static int nextprimenumber(int n) {
        int num = n;
        while (!isprime(num)) {
            num++;
        }
        return num;
    }

    public static boolean isprime(int num) {
        if (num < 2) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
           
        }
        return true;
    }
}
