
//  In the ancient kingdom of Eldoria, a long-lost mystical scroll was discovered inside the ruins of the Temple of Wisdom. The scroll contained a secret message, but it was written in a strange encrypted form.

//  According to legend, the message is encoded using a simple lexicographic shift rule:

//  Every lowercase letter ('a'–'z') is replaced with the next letter in the alphabet (i.e., 'a' → 'b', 'z' → 'a').
//  Every uppercase letter ('A'–'Z') follows the same rule ('A' → 'B', 'Z' → 'A').
//  Numbers (0-9) are also encoded by shifting them to the next digit ('0' → '1', '9' → '0').
//  Spaces and special characters remain unchanged.
//  The High Council of Eldoria has summoned you, the greatest coder of the realm, to write a program that can decrypt the scroll and reveal its hidden knowledge.

//  Can you unlock the secrets of the Temple of Wisdom before it’s too late?

//  Example Cases:
//  Example 1:
//  Input:
//  "Hello World! abc#xyz 123"
//  Output:
//  "Ifmmp Xpsme! bcd#yza 234"

//  Example 2:
//  Input:
//  "Zebra 987!"
//  Output:
//  "Afcsb 098!"

package Arrays;

import java.util.*;

public class kingdommessage {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
       
String str="Hello World! abc#xyz 123 ";

System.out.print(lexicographicmeassage(str));

    }

    public static String lexicographicmeassage(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii=str.charAt(i);
            if (ch == 'z') {
                sb.append('a');
            }
           else if (ch == 'Z') {
                sb.append('A');

            } 
            else if(ch=='9'){
                sb.append("0");
            }
            else if(ascii>=65&&ascii<90){
                char c=(char)(ch+1);
                sb.append(c);
            }
            else if(ascii>=97&&ascii<122){
                char c=(char)(ch+1);
                sb.append(c);
            }
            else if(ascii>=48&&ascii<57){
               char c=(char)(ascii+1);
               sb.append(c);
            }
            else {
                sb.append(ch);
            }

        }
        return sb.toString();

    }

}
