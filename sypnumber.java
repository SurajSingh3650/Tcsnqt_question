package Arrays;

import java.util.*;

public class sypnumber {
    public static void main(String args[]) {
        int number = 132;
        System.out.println(issyp(number));
    }

    public static boolean issyp(int number) {
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number = number / 10;
        }
        if (product == sum) {
            return true;
        }
        return false;
    }
}
