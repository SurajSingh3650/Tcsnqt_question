package Arrays;
import java.util.*;
public class countword {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     
System.out.print(countWord(str));
    }
    public static int countWord(String str){
int count=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }
}
