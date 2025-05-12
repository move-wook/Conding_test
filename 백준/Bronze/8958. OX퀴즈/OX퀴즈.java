import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 테스트 케이스 수
        sc.nextLine(); // 개행 제거

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            int score = 0;
            int combo = 0;

            for (char ch : line.toCharArray()) {
                if (ch == 'O') {
                    combo++;
                    score += combo;
                } else {
                    combo = 0;
                }
            }

            System.out.println(score);
        }

        sc.close();
    }
}
