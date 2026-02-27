import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int b = 1; b <= 500; b++) {
            for (int a = b; a <= 500; a++) {
                
                if (a * a == b * b + N) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}