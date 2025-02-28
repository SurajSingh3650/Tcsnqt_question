package Arrays;
import java.util.*;
public class secretmessage {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
System.out.print(message(str));
    }
    public static String message(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            sb.append((char)('a'+(ch-'a'+1)%26));
        }
        return sb.toString();
    }

}
