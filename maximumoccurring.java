package Arrays;
import java.util.*;
public class maximumoccurring {
    public static void main(String args[]){
        String str="surajsingh";
System.out.print(maximum(str));
    }
    public static Character maximum(String str){
int feqarr[]=new int[26];
for(int i=0;i<str.length();i++){
    feqarr[str.charAt(i)-'a']++;
}
int largest=-1;
char ch=' '; 
for(int i=0;i<feqarr.length;i++){
if(feqarr[i]>largest){
largest=feqarr[i];
ch=(char) (i+'a');
}
}
return  ch;

    }

    public static Character  maximum1(String str){
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<str.length();i++){

        }
    }
}
