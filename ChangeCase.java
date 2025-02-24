package Arrays;
import java.util.*;
public class ChangeCase {
    public static void main(String args[]){
        String str="JavA";
        System.out.print(changecase1(str));
    }
    public static String changecase(String str){
StringBuilder sb=new StringBuilder();
for(int i=0;i<str.length();i++){
    int number= (int)str.charAt(i);
    if(number>=65&&number<=90){
        sb.append((char)(number+32));
    }
    else if(number>=97&&number<=122){
        sb.append((char)(number-32));
    }
    else{
        sb.append(str.charAt(i));
    }
}
return sb.toString();
    }
    public static String changecase1(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            int ascii=(int)str.charAt(i);
            if(ascii>=65&&ascii<=90){
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
            else if(ascii>=97&&ascii<=122){
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
