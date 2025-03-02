package Arrays;

import java.util.*;

public class productdetaisl {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        HashMap<String, Double> sales = new HashMap<>();
        double totalsellingprine = 0.0;
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            Double price = sc.nextDouble();
            int quantity = sc.nextInt();
            sc.nextLine(); 
            double sellprice = price * quantity;
            if (sales.containsKey(name)) {
                sales.put(name, sales.get(name) + sellprice);
            } else {
                sales.put(name, 0.0);
            }
            totalsellingprine+=sellprice;
        }
String highestsellingitem="";
double maxsellingprice=0.0;
for(Map.Entry<String,Double>entry:sales.entrySet()){
    if(entry.getValue()>maxsellingprice){
        maxsellingprice=entry.getValue();
        highestsellingitem=entry.getKey();
    }
}

double avergaesellingprice=totalsellingprine/n;
System.out.println(highestsellingitem);
System.out.printf("%.2f\n", totalsellingprine);
System.out.printf("%.2f\n", avergaesellingprice);
sc.close();
    }
}
