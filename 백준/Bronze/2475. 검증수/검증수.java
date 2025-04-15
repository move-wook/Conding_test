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
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int N0 = Integer.parseInt(st.nextToken());
        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());
        int N3= Integer.parseInt(st.nextToken());
        int N4 = Integer.parseInt(st.nextToken());
        int snum = (int) Math.pow(N0, 2) + (int) Math.pow(N1, 2) +
        		(int) Math.pow(N2, 2) + (int) Math.pow(N3, 2) +
        		(int) Math.pow(N4, 2);
        bw.write(String.valueOf(snum%10));
        bw.flush();
        bw.close();
        bf.close();
       
	}
}