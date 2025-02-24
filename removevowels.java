package Arrays;

import java.util.*;

public class removevowels {
    public static void main(String args[]) {
        String str = "take u forward";
        System.out.print(vowels(str));
    }

    public static String vowels(String str) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o'
        && str.charAt(i) != 'u' && str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I'
        && str.charAt(i) != 'O' && str.charAt(i) != 'U') {
    s.append(str.charAt(i));
}

                
            
        }
        return s.toString();
    }
}
