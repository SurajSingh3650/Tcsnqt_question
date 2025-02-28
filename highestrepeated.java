package Arrays;

import java.util.*;

public class highestrepeated {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // = sc.nextLine();
        String str  ="abcdefghij google microsoft";
        System.out.print(highestrepeatedletters(str));
    }

    public static String highestrepeatedletters(String str) {
        String arr[] = str.split(" ");
        int maxcount = 0;
        String failstring = "";
        int cuurcount = 0;
        for (int i = 0; i < arr.length; i++) {
            String currstring = arr[i];
            int freqarr[] = new int[26];
            int j = 0;
            while (j < currstring.length()) {

                char ch = currstring.charAt(j);

                freqarr[ch - 'a']++;
                j++;
            }
           cuurcount = 0;
            for (int k = 0; k < freqarr.length; k++) {
                if (freqarr[k] >= 2) {
                    cuurcount++;
                }
            }
            if (cuurcount > maxcount) {
                maxcount = cuurcount;
                failstring = currstring;
            }

        }
        if(failstring==""){
            return "nostring";
        }
        return failstring;
    }
}
