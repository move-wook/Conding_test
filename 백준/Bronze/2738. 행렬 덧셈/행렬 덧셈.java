import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 첫 줄에서 N과 M 읽기
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
        
        // 행렬 A와 B 선언
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        
        for (int i = 0; i < N; i++) {
            String[] line = bf.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(line[j]);
            }
        }

        // 행렬 B 입력
        for (int i = 0; i < N; i++) {
            String[] line = bf.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                B[i][j] = Integer.parseInt(line[j]);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                bw.write(Integer.toString(A[i][j] + B[i][j])+ " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        bf.close();
	
	}
}