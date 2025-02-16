package Numbers;

// Question: Prime Number in the given range
//  Input: A = 10, B = 30
//  Output: [11, 13, 17, 19, 23, 29
import java.util.*;

public class primenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        ArrayList<Integer> List = new ArrayList<>(prime(a, b));
        System.out.print(List);
    }

    public static ArrayList<Integer> prime(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = a; i < b; i++) {
            if (isprime1(i)) {
                list.add(i);
            }

        }
        return list;
    }

     // optimized way to give a prime number
     public static boolean isprime1(int number) {










        if (number < 2) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    //     int count = 0;
    //     for (int i = 1; i <=Math.sqrt(number); i++) {
    //         if (number % i == 0) {
    //             count++;
    //         }
    //         if (number / i != i) {
    //             count++;
    //         }

    //     }
    //     if(count>2){
    //         return false;
    //     }
    //     return true;
    // }

    // public static boolean isprime(int number) {
    //     int count = 0;
    //     for (int i = 1; i <= number; i++) {
    //         if (number % i == 0) {
    //             count++;
    //         }

    //     }
    //     if (count > 2) {
    //         return false;

    //     }
    //     return true;
    // }

    // optimized way to give a prime number
 
}
