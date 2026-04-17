import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String[] subtraction = br.readLine().split("-");
        int result = Integer.MAX_VALUE; // 초기값 설정

        for (int i = 0; i < subtraction.length; i++) {
            int temp = 0;

          
            String[] addition = subtraction[i].split("\\+");
            for (String s : addition) {
                temp += Integer.parseInt(s);
            }

            if (result == Integer.MAX_VALUE) {
                result = temp;
            } else {
                result -= temp;
            }
        }
        System.out.println(result);
    }
}