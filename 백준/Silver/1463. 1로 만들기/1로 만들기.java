
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

		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] dp = new int[N+1];
		for(int i = 2; i <= N; i++){
			 dp[i] = dp[i - 1] + 1;

		    if (i % 2 == 0) {
		        dp[i] = Math.min(dp[i], dp[i / 2] + 1);
		    }

		    if (i % 3 == 0) {
		        dp[i] = Math.min(dp[i], dp[i / 3] + 1);
		    }
		}
		bw.write(String.valueOf(dp[N]));
	    bw.flush();
        bw.close();
        bf.close();
	}
}