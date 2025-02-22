package Arrays;
import java.util.*;
public class sTillsingledigit {
    public static void main(String[] args) {
        int number=9875;
        System.out.println(single(number));
    }
    public static int single(int number){
        while(number>=10){
            int sum=0;
            while(number>0){
               int digit=number%10;
               sum+=digit;
               number=number/10; 
            }
            number=sum;
        }
    return number;
      
    }
   

}
