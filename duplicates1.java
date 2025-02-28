package Arrays;
import java.util.*;
public class duplicates1 {
    public static void main(String args[]){
        String str="sinstriiintng";
        duplicatesprintonly(str);
    }
    public static void duplicatesprintonly(String str){
        int freqarr[]=new int[26];
        for(int i=0;i<str.length();i++){
            freqarr[str.charAt(i)-'a']++;
        }
        for(int i=0;i<freqarr.length;i++){
            if(freqarr[i]>=2){
                System.out.println((char)(i+'a') + "-" + freqarr[i]);  
            }
        }
    }
}
