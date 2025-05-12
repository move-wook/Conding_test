import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;
        String resultStr = String.valueOf(result);

        int[] count = new int[10];
        for (int i = 0; i < resultStr.length(); i++) {
            int digit = resultStr.charAt(i) - '0';
            count[digit]++;
        }

        for (int i = 0; i < 10; i++) {
            bw.write(count[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
