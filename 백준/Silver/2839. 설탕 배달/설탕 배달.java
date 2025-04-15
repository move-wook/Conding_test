import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
	public static void main(String args[]) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(bf.readLine());

		int result = -1; // 기본값: 만들 수 없는 경우

		int maxFive = N / 5;
		for (int i = maxFive; i >= 0; i--) {
		    int remain = N - (5 * i);
		    if (remain % 3 == 0) {
		        int j = remain / 3;
		        result = i + j; // 총 봉지 개수
		        break; // 가장 적은 개수를 찾았으므로 종료
		    }
		}

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		bf.close();
		
	}
}