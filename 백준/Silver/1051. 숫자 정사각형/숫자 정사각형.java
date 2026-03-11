import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        int size = Math.min(N, M);

        while (size > 1) {
            for (int i = 0; i <= N - size; i++) {
                for (int j = 0; j <= M - size; j++) {
                    int target = map[i][j];
                   
                    if (target == map[i][j + size - 1] &&         // 우측 상단
                        target == map[i + size - 1][j] &&         // 좌측 하단
                        target == map[i + size - 1][j + size - 1]) { // 우측 하단
                        System.out.println(size * size);
                        return;
                    }
                }
            }
            size--;
        }

        System.out.println(1);
    }
}