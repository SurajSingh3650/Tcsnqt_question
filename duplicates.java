package Arrays;
import java.util.*;
public class duplicates {
    public static void main(String args[]){
        String str="bcabc";
        System.out.print(removeduplicates(str));
    }
    public static String removeduplicates(String str){
        StringBuilder sb=new StringBuilder();
        int feqarr[]=new int[26];
for(int i=0;i<str.length();i++){
    feqarr[str.charAt(i)-'a']++;
}
for(int i=0;i<feqarr.length;i++){
if(feqarr[i]==1){
    sb.append((char)(i+'a'));
}
}
return sb.toString();
    }
}
