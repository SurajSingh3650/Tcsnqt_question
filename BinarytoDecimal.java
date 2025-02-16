package Numbers;

import java.util.*;

public class BinarytoDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        
        System.out.println(todecimal(binary));
    }

    public static int todecimal(int binary) {
        int n = binary;
        int decimal = 0;
        int i = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            decimal += lastdigit * Math.pow(2, i);
            i++;
            n = n / 10;
        }
        return decimal;
    }
}
