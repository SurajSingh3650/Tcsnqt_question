package Arrays;
import java.util.*;
public class sortcharacter {
    public static void main(String args[]){
        String str="zxcbg";
        System.out.print(sort(str));
        
    }
    public static String sort(String str){
char ans[]=new char[str.length()];
for(int i=0;i<ans.length;i++){
    ans[i]=str.charAt(i);
}
  Arrays.sort(ans);
StringBuilder ans1=new StringBuilder();
for(int i=0;i<ans.length;i++){
    ans1.append(ans[i]);
}
return ans1.toString();

    }
}
