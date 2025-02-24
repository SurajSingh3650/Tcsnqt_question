package Arrays;
import java.util.*;
public class Stringpalindrome {
    public static void main(String args[]){
        String str="abcdcba";
        System.out.print(ispalindrome2(str));
    }
    public static boolean ispalindrome1(String str){
        StringBuilder s=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            s.append(str.charAt(i));
        }
        return str.equals(s.toString());
    }

    public static boolean ispalindrome2(String str){
        int start =0;
        int end=str.length()-1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
