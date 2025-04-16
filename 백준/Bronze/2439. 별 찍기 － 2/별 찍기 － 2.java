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

        for (int i = 1; i <= N; i++) {
            StringBuilder str = new StringBuilder();
            // 공백 출력
            for (int j = 0; j < N - i; j++) {
                str.append(" ");
            }
            // 별 출력
            for (int j = 0; j < i; j++) {
                str.append("*");
            }
            bw.write(str.toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();
       
	}
}
