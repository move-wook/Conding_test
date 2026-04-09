import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if (s.equals("0")) break;

            boolean isPalindrome = true;
            int len = s.length();
            
            for (int i = 0; i < len / 2; i++) {
                if (s.charAt(i) != s.charAt(len - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println(isPalindrome ? "yes" : "no");
        }
    }
}