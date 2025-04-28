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

        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;

        int len = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        for (int i = 0; i < len; i++) {
            int num = Integer.parseInt(st.nextToken());
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
        }

        bw.write(MIN + " " + MAX + "\n"); // 줄바꿈 추가
        bw.flush();
        bw.close();
        bf.close();
	}
}