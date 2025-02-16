package Numbers;
import java.util.*;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=(int)Math.log10(Math.abs(n))+1;
        System.out.println(Armstrong(n, digit));
        


    }
    public static boolean Armstrong(int n,int digit){
int orginalenumber=n;
        int number=0;
        while(n>0){
            int lastdigit=n%10;
            number+=Math.pow(lastdigit,digit);
            n=n/10;
        }
        if(orginalenumber==number){
            return true;
        }
        return false;
    }
    
}
