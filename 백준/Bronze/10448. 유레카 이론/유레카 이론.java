import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] triangleNums = new int[45];
        for (int i = 1; i < 45; i++) {
            triangleNums[i] = i * (i + 1) / 2;
        }
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int k = sc.nextInt();
            System.out.println(solve(k, triangleNums));
        }
    }

    public static int solve(int k, int[] tri) {
        for (int i = 1; i < 45; i++) {
            for (int j = 1; j < 45; j++) {
                for (int l = 1; l < 45; l++) {
                    if (tri[i] + tri[j] + tri[l] == k) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}