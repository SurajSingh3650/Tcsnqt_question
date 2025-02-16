package Numbers;
import java.util.*;
public class Reversedigit {
    public static void main(String args[]){
        int number=1234;
        System.out.println(reverse(number));
    }
    public static int reverse(int number){
        int n=number;
        int reversenumber=0;
        while(n>0){
            int lastdigit=n%10;
             reversenumber=reversenumber*10+lastdigit;
             n=n/10;
        }
return reversenumber;
    }
}
