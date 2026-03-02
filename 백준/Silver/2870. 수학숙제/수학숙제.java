import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<BigInteger> results = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = sc.next();
            String[] parts = line.split("[a-z]+");

            for (String part : parts) {
                if (!part.isEmpty()) {
                    results.add(new BigInteger(part));
                }
            }
        }
        Collections.sort(results);
        StringBuilder sb = new StringBuilder();
        for (BigInteger res : results) {
            sb.append(res).append("\n");
        }
        System.out.print(sb.toString());
    }
}