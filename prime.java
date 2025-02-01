package Arrays;

//this the optimal approach to solve the problem this in time complecity in o(squrt(n));
public class prime {
    public static void main(String args[]) {
        int n = 7;
        int count = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
           
        }
        if(count>2){
            System.out.print("the numbers"+n+"is not a prime number");
        }else{
            System.out.print("the numbers:"+n+"is a prime number");
        }
    }
}
