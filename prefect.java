package Numbers;
import java.util.*;

public class prefect {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
System.out.print(prefect(n));

    }

    public static boolean prefect(int n){
        int sum=0;
      for(int i=1;i<n;i++){
        if(n%i==0){
            sum+=i;
        }

      }
      if(n==sum){
        return true;

      }
      return  false;
    }
}
