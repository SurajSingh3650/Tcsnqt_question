package Arrays;
import java.util.*;
public class totalcost {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int weight=sc.nextInt();
        int distance=sc.nextInt();
        System.out.print(totalcost(weight, distance));
    }
    public static float totalcost(int weight,int distance){
       float total=0;
       float totalcostdistance=(float)((distance/10)*0.5);
       float totalcostweight =(float)(weight*2.0);
       total=5+totalcostdistance+totalcostweight;
       return total;
    }
}
