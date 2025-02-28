package Arrays;
import java.util.*;

public class anagrams {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.print(isanagrams(str1, str2));
    }
    public static boolean isanagrams(String str1,String str2){
        int freqarr[]=new int[26];
        for(int i=0;i<str1.length();i++){
            freqarr[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            freqarr[str2.charAt(i)-'a']--;
        }
        for(int i=0;i<freqarr.length;i++){
            if(freqarr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
