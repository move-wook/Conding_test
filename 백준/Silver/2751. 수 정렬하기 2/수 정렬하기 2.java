import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 첫 줄에서 N과 M 읽기
        int N = Integer.parseInt(bf.readLine());
        int []M = new int[N];
        int count = 0;
        while (count < N) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            while (st.hasMoreTokens() && count < N) {
                M[count++] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(M);
        for(int i=0; i<M.length; i++){
        	bw.write(Integer.toString(M[i]));
         	bw.newLine();
        }
       
        bw.flush();
        bw.close();
        bf.close();
	}
}