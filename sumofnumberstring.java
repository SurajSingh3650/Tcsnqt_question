package Arrays;
import java.util.*;
public class sumofnumberstring {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(sumofnumber(str));
    }
    public static int sumofnumber(String str){
        int sum=0;
        String temp="0";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
    
            if(Character.isDigit(c)){
                temp+=c;
            }
            else {
                sum+=Integer.parseInt(temp);
                temp="0";
            }
        }
        return sum+Integer.parseInt(temp);
    }
}
