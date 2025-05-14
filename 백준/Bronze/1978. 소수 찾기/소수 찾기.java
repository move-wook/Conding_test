import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        int count = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(nums[i]);

            if (num < 2) continue;

            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) count++;
        }

        bw.write(String.valueOf(count));
        bw.newLine();
        bw.flush();
        br.close();
        bw.close();
    }
}