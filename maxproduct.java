package Arrays;

public class maxproduct {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 0 };
System.out.print(better(arr));
    }

    public static int brutemethod(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
           
            for (int j = i + 1; j < arr.length; j++) {
                int product = 1;
                for (int k = i; k <= j; k++) {
                    product *= arr[k];
                    max=Math.max(max,product);
                }
               
            }
            
        }
        return max;
    }

    public static int better(int arr[]){
       
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            int product=arr[i];
            for( int j=i+1;j<arr.length;j++){
 max=Math.max(max, product);
 product*=arr[j];
            }
        }
        return max;
    }
}
