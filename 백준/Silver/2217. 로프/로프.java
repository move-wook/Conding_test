import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] ropes = new Integer[n];

        for (int i = 0; i < n; i++) {
            ropes[i] = sc.nextInt();
        }

       
        Arrays.sort(ropes, Collections.reverseOrder());

        long maxWeight = 0;

       
        for (int i = 0; i < n; i++) {
           
            long currentWeight = (long) ropes[i] * (i + 1);
            
            if (currentWeight > maxWeight) {
                maxWeight = currentWeight;
            }
        }

        System.out.println(maxWeight);
    }
}