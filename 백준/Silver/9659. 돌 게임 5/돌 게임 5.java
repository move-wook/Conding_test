import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
      
        long n = Long.parseLong(br.readLine());
        
        // 홀수이면 상근(SK), 짝수이면 창영(CY)
        if (n % 2 != 0) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}