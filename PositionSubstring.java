package Arrays;
import java.util.*;
public class PositionSubstring {
    public static void main(String args[]){
String str1="takeuforward";
String str2="forward";
System.out.print(indexofsubstring(str1, str2));
    }
    public static int indexofsubstring(String str1,String str2){
        return str1.indexOf(str2);
    }
    

}
