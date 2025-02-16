package Numbers;

import java.util.*;

public class palindromenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>(palindrome(a, b));
        System.out.println(List);

    }

    public static ArrayList<Integer> palindrome(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            if (isreverse(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static boolean isreverse(int number) {

        String str = new StringBuilder(String.valueOf(Math.abs(number))).reverse().toString();
        String s = String.valueOf(number);
        if (str.equals(s)) {
            return true;
        }
        return false;
    }
}
