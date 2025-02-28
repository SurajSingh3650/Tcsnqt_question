package Arrays;

import java.util.*;

public class largestword {
    public static void main(String args[]) {
        String s = "suraj singh is good and handsome boy";
        System.out.print(largest(s));
    }

    public static String largest(String str) {
    String arr[]=str.split(" ");
    int largest=0;
    String largeststring="";
    for(int i=0;i<arr.length;i++){
if(arr[i].length()>largest){
    largest =arr[i].length();
largeststring=arr[i];
}

    }
    return largeststring;
    }
}
