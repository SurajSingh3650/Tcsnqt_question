package Numbers;
import java.util.*;
public class sumodigit {
    public static void main(String args[]){
        int n=456;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.print(sum);
    }
}
