package Arrays;

import java.util.*;

public class reverseword {
    public static void main(String args[]) {
        String s = "TUF is great for interview preparation";
        System.out.print(reverse1(s));
    }

    public static String reverse(String s) {

        String strArray[] = s.split(" ");
        StringBuilder str = new StringBuilder();

        for (int i = strArray.length - 1; i >= 0; i--) {
            str.append(strArray[i]);
            str.append(" ");
        }
        return str.toString();
    }

    public static String reverse1(String s){
Stack<String>stack=new Stack<>();
// StringBuilder str=new StringBuilder();
String  str="";
for(int i=0;i<s.length();i++){
    if(s.charAt(i)==' '){
        stack.push(str);
        str="";

    }
    else{
        str +=s.charAt(i);

        // str.append(s.charAt(i));
    }
}
if(!str.isEmpty()){
    stack.push(str);
}

StringBuilder st=new StringBuilder();
while(!stack.isEmpty()){
st.append(stack.peek());
st.append(" ");

stack.pop();
}
return st.toString();
    }


public static String reverse2(String s){
    
}

}

