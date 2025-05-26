import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main {
public static void main(String args[]) throws IOException{
	    // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] scores = new int[n];
        int max = 0;

        // 점수 입력 + 최대값 계산
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            if (scores[i] > max) max = scores[i];
        }

        // 점수 변환 후 평균 계산
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double) scores[i] / max * 100;
        }

        double avg = sum / n;

        bw.write(String.valueOf(avg));
        bw.flush();
        bw.close();
        br.close();
	}
}