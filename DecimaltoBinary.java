package Numbers;
import java.util.*;
public class DecimaltoBinary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();
       System.out.print(Integer.toBinaryString(decimal));
        // System.out.println(tobinary(decimal));


    }
    public static String tobinary(int decimal){
        int n=decimal;
       StringBuilder str=new StringBuilder();
       while(n>0){
        
        str.append(n%2);
n=n/2;
       }
       return str.reverse().toString();
    
    }
}
