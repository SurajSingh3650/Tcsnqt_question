package Arrays;
import java.util.*;

public class supermaket {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(priceofproduct(str));

    }
    public static int priceofproduct(String str){
        int num=Integer.parseInt(str);
        int product=1;
        while(num>0){
            int digit=num%10;
            product*=digit;
            num=num/10;
        }
        return product;
    }
}
